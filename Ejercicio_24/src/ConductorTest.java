import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConductorTest {
    private Conductor c;
    private Vehiculo v;

    @BeforeEach
    void setUp()throws Exception{
        v = new Vehiculo(c,2000,400,5,"aaa");
        c = new Conductor("Santiago",5000,v);
        v.setDueño(c);
    }

    @Test
    void cagarSaldoTest(){
        c.cargarSaldo(500);
        assertEquals(5450,c.getSaldo());
    }

    @Test
    void descontarSaldoTest(){
        c.descontarSaldo(1000);
        assertEquals(4000,c.getSaldo());
    }

    @Test
    void cobrarTest(){
        assertEquals(2999.6,c.cobrar(3000));
    }

    @Test
    void crearViajeTest(){
        assertNotNull(c.crearViaje("La plata","Casares",2000, LocalDate.of(2024,12,10)));
        assertNull(c.crearViaje("La plata","Casares",300,LocalDate.now()));
    }
}
