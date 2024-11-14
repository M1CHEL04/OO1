import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MascotaTest {
    private Mascota mascota;
    private Medico medico;
    private ConsultaMedica consultaMedica;
    private Vacunacion vacunacion;

    @BeforeEach
    void setUp()throws Exception{
        mascota = new Mascota("Pepito","Perro", LocalDate.now());
        medico = new Medico("Santiago",LocalDate.of(2023,11,14),3000);
    }

    @Test
    void montoGeneradoFechaTest(){
        mascota.darAltaConsultaMedica(medico); mascota.darAltaVacunacion(medico,"Aaa",300);
        assertEquals(7200,mascota.montoGeneradoFecha(LocalDate.now()));
        assertEquals(0,mascota.montoGeneradoFecha(LocalDate.of(2023,10,10)));
    }
}
