import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarpetaTest {
    private Carpeta c1;
    private Carpeta c2;
    private Email e1;
    private Email e2;

    @BeforeEach
    void setUp() throws Exception{
        c1 = new Carpeta("Carpeta1");
        c2 = new Carpeta("Carpeta2");
        e1 = new Email("Titulo1","Cuerpo1");
        e2 = new Email("Titulo2", "Cuerpo2");
    }

    @Test
    void TestAgregarMail(){
        c1.agregarMail(e1);
        assertEquals(1,c1.getEmails().size());
    }

    @Test
    void TestMover(){
        c1.agregarMail(e1); c2.agregarMail(e2);
        c1.mover(e1,c2);
        assertEquals(2,c2.getEmails().size());
    }

    @Test
    void TestBuscar(){
        c1.agregarMail(e1);
        assertEquals(e1,c1.buscar("Titulo1"));
    }

    @Test
    void TestEspacioOcupado(){
        c1.agregarMail(e1);
        assertEquals(14,c1.espacioOcupado());
    }
}
