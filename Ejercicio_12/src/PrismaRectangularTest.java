import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrismaRectangularTest {
    private PrismaRectangular p;

    @BeforeEach
    void setUp() throws Exception{
        p = new PrismaRectangular("Madera","Rojo",4,2,4);
    }

    @Test
    void testGetVolumen(){
        assertEquals(32,p.getVolumen());
    }

    @Test
    void testGetSuperficie(){
        assertEquals(64,p.getSuperficie());
    }
}
