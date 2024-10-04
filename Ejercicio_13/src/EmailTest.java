import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailTest {
    private Email mail;
    private Archivo a;

    @BeforeEach
    void setUp() throws Exception{
        a = new Archivo("Hola.txt");
        mail = new Email("Hola","AAAA");
    }

    @Test
    void testAddArchivo(){
        mail.addArchivo(a);
        assertEquals(1,mail.adjuntos().size());
    }

    @Test
    void testTamño(){
        mail.addArchivo(a);
        assertEquals(16,mail.tamaño());
    }
}
