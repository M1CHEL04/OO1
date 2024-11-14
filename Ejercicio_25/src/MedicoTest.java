import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {
    private Medico medico;

    @BeforeEach
    void setUP()throws Exception{
        medico = new Medico("Santiago", LocalDate.of(2021,11,14),4000);
    }

    @Test
    void calcularAntiguedadTest(){
        assertEquals(3,medico.calcularAntiguedad());
    }
}
