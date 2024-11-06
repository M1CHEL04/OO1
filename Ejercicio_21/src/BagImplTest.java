import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BagImplTest {
    private BagImpl<String> bolsa;

    @BeforeEach
    void setUp() throws Exception{
        this.bolsa = new BagImpl<>();
    }

    @Test
    void addTest(){
        bolsa.add("Chico"); bolsa.add("Chico"); bolsa.add("Mediano");
        assertEquals(2,bolsa.occurrencesOf("Chico"));
        assertEquals(1,bolsa.occurrencesOf("Mediano"));
    }

    @Test
    void removeTest(){
        bolsa.add("Chico"); bolsa.add("Mediano"); bolsa.add("Mediano");
        bolsa.remove("Mediano");
        assertEquals(1,bolsa.occurrencesOf("Mediano"));
    }

    @Test
    void removeAllTest(){
        bolsa.add("chico"); bolsa.add("Mediano");
        bolsa.removeAll("Mediano");
        assertEquals(0,bolsa.occurrencesOf("Mediano"));
    }

    @Test
    void sizeTest(){
        bolsa.add("Chico"); bolsa.add("Chico"); bolsa.add("Mediano");
        assertEquals(3,bolsa.size());
    }
}
