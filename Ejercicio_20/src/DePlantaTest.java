import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DePlantaTest {
    private DePlanta c1;

    @BeforeEach
    void setUp() throws Exception{
        LocalDate fi = LocalDate.of(2024,9,30);
        c1 = new DePlanta(fi,100,50,50,true,false);

    }

    @Test
    void getBasicoTest(){
        assertEquals(150,c1.getBasico());
    }

    @Test
    void getDuracionTest(){
        assertEquals(1,c1.getDuracion());
    }
}
