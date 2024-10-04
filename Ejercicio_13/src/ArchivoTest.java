import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArchivoTest {
    private Archivo a;

    @BeforeEach
    void setUp() throws Exception{
        a = new Archivo("hola.txt");
    }

    @Test
    void testTamaño(){
        assertEquals(8,a.tamaño());
    }
}
