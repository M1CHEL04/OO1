import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PorHoraTest {
    private PorHora p1;

    @BeforeEach
    void setUp() throws Exception{
        LocalDate fi = LocalDate.of(2024,8,30);
        LocalDate ff = LocalDate.now();
        p1 = new PorHora(fi,ff, 100, 5);
    }

    @Test
    void getBasicoTest(){
        assertEquals(500,p1.getBasico());
    }

    @Test
    void getDuracionTest(){
        assertEquals(2,p1.getDuracion());
    }

    @Test
    void noVencidoTest(){
        assertTrue(p1.noVencido());
    }
}
