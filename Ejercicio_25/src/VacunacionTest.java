import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class VacunacionTest {
    private Vacunacion vacunacion;
    private Medico veterinario;
    private Mascota mascota;

    @BeforeEach
    void setUp()throws Exception{
        veterinario = new Medico("Santiago", LocalDate.now(),400);
        mascota = new Mascota("Pepito","Perro",LocalDate.now());
        vacunacion = new Vacunacion(mascota,veterinario,LocalDate.of(2024,11,17),"aaa",400);
    }

    @Test
    void calcularCostoServicioTest(){
        assertEquals(1500,vacunacion.calcularCostoServicio());
    }

    @Test
    void esDomingoTest(){
        assertTrue(vacunacion.esDomingo());
    }

    @Test
    void esIgualTest(){
        assertTrue(vacunacion.esIgual(LocalDate.of(2024,11,17)));
        assertFalse(vacunacion.esIgual(LocalDate.now()));
    }
}
