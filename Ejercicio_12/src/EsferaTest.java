import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EsferaTest {
    private Esfera e;

    @BeforeEach
    void setUp() throws Exception{
        e= new Esfera("Plastico","Verde",4);
    }

    @Test
    void testGetVolumen(){
        assertEquals(268.08,e.getVolumen(),0.01);
    }

    @Test
    void testGetSuperfice(){
        assertEquals(201.06,e.getSuperficie(),0.01);
    }
}
