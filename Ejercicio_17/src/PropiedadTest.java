import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropiedadTest {
    private Propiedad p;
    private Reserva r1,r2;

    @BeforeEach
    void setUp() throws Exception{
        p = new Propiedad("av 60","Casa",100);
    }

    @Test
    void crearReservaTest() {
        DateLapse2 lapso = new DateLapse2(LocalDate.now(), 5);
        p.crearReserva(lapso);
        assertEquals(1,p.getMisReservas().size());
    }

    @Test
    void cancelarReserva(){
        DateLapse2 lapso = new DateLapse2(LocalDate.now(),5);
        DateLapse2 lapso2 = new DateLapse2(LocalDate.now(),4);
        p.crearReserva(lapso); p.crearReserva(lapso2);
        assertEquals(1,p.getMisReservas().size());
    }
}
