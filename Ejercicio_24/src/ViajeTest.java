import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ViajeTest {
    private Viaje v;
    private Conductor c;
    private Pasajero p;
    private Vehiculo vehiculo;

    @BeforeEach
    void setUp() throws Exception{
        vehiculo = new Vehiculo(c,2022,10000,5,"Aaa");
        c = new Conductor("Santiago Michel",5000,vehiculo);
        p = new Pasajero("Massimo",4300);
        v = new Viaje ("Casares",2000,"La Plata",c,vehiculo, LocalDate.of(2024,12,31));
    }

    @Test
    void fueHace30DiasTest(){
        assertFalse(v.fueEnHace30Dias());
    }

    @Test
    void addIntegranteTest(){
        assertTrue(v.addIntegrante(p));
    }
}
