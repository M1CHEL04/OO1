import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class GuarderiaTest {
    private Guarderia guarderia;
    private Mascota m;

    @BeforeEach
    void setUp()throws Exception{
        m = new Mascota("Pepito","Perro", LocalDate.of(2024,10,14));
        guarderia = new Guarderia(m,10,LocalDate.of(2024,10,14));
    }

    @Test
    void calcularCostoServicioTest(){
        assertEquals(5000,guarderia.calcularCostoServicio());
    }

    @Test
    void esIgualTest(){
        assertTrue(guarderia.esIgual(LocalDate.of(2024,10,20)));
        assertFalse(guarderia.esIgual(LocalDate.of(2023,10,10)));
    }
}
