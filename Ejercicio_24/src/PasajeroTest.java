import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PasajeroTest {
    private Pasajero p1;
    private Conductor c;
    private Vehiculo v;

    @BeforeEach
    void setUp()throws Exception{
        p1 = new Pasajero("Massi",3000);
        v = new Vehiculo(c,2005,4000,3,"aaaa");
        c = new Conductor("Santiago",3500,v);
        v.setDueño(c);
    }

    @Test
    void cargarSaldo(){
        p1.cargarSaldo(500);
        assertEquals(3450,p1.getSaldo());
    }

    @Test
    void anotarseViajeTest(){
        Viaje viaje = c.crearViaje("La plata","Casares",400, LocalDate.of(2024,12,10));
        assertTrue(p1.anotarseViaje(viaje));
        assertFalse(p1.anotarseViaje(new Viaje("Origen",3000,"Destino",c,v,LocalDate.now())));
    }

    @Test
    void cobrarTest(){
        p1.cobrar(600);
        assertEquals(2400,p1.getSaldo());
        p1.anotarseViaje(new Viaje("Origen",3000,"Destino",c,v,LocalDate.of(2024,12,10)));
        p1.cobrar(600);
        assertEquals(2300,p1.getSaldo());
    }

}
