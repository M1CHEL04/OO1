import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultaMedicaTest {
    private ConsultaMedica consultaMedica;
    private Mascota mascota;
    private Medico veterinario;

    @BeforeEach
    void setUp()throws Exception{
        mascota = new Mascota("Pepito","Perro", LocalDate.of(2024,10,14));
        veterinario = new Medico("Santiago",LocalDate.of(2023,11,14),5000);
        consultaMedica = new ConsultaMedica(mascota,veterinario,LocalDate.now());
    }

    @Test
    void calcularCostoServicio(){
        assertEquals(5400,consultaMedica.calcularCostoServicio());
    }

    @Test
    void esIgual(){
        assertTrue(consultaMedica.esIgual(LocalDate.now()));
        assertFalse(consultaMedica.esIgual(LocalDate.of(2023,11,10)));
    }

    @Test
    void esDomingo(){
        assertFalse(consultaMedica.esDomingo());
    }
}
