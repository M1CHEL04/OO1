import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeConstruccionTest {
    private Esfera e;
    private Cilindro c;
    private PrismaRectangular p;
    private ReporteDeConstruccion reporte;

    @BeforeEach
    void setUp() throws Exception{
        e = new Esfera("Hierro","Verde",4);
        c = new Cilindro("Hierro","Rojo", 4,4);
        p = new PrismaRectangular("Hierro", "Rojo",4, 2 ,4);
        reporte = new ReporteDeConstruccion();
    }

    @Test
    void testGetVoluemnDeMaterial(){
        reporte.addPieza(e); reporte.addPieza(c); reporte.addPieza(p);
        assertEquals((e.getVolumen()+p.getVolumen()+c.getVolumen()),reporte.getVolumenDeMaterial("Hierro"));
    }

    @Test
    void testGetSuperficieDeColor(){
        reporte.addPieza(e); reporte.addPieza(c); reporte.addPieza(p);
        assertEquals((c.getSuperficie()+p.getSuperficie()),reporte.getSuperficieDeColor("Rojo"));
    }
}
