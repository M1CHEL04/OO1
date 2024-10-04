import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CilindroTest {
    private Cilindro c;

    @BeforeEach
    void setUp() throws Exception{
        c = new Cilindro("Hierro","Rojo",10,10);
    }

    @Test
    void testGetVolumen(){
        assertEquals(3141.59,c.getVolumen(),0.01);
    }

    @Test
    void testGetSuperfice(){
        assertEquals(691.15,c.getSuperficie(),0.01);
    }
}
