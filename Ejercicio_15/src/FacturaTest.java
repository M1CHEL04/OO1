import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {
    private Factura factura;
    private Usuario cliente;
    private CuadroTarifario ct;

    @BeforeEach
    void setUp() throws Exception{
        cliente = new Usuario("Santiago","Av 60");
        ct = new CuadroTarifario(100);
        factura = new Factura(cliente,ct);
        Consumo c1,c2;
        c1= new Consumo(10,10);
        c2= new Consumo(20,20);
        cliente.addConsumo(c1);
        cliente.addConsumo(c2);
    }

    @Test
    void TestMontoFinal(){
        assertEquals(2000,factura.montoFinal());
    }
}
