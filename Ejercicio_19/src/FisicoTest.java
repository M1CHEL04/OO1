import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FisicoTest {
    private Fisico cf;
    private Interurbano u1;
    private Internacional i1;
    private Local l1;

    @BeforeEach
    void setUp() throws Exception {
        cf = new Fisico("Santiago", "Av 60 1629", 444);
        u1 = new Interurbano(LocalDate.of(2024, 10, 10), "Carlos Casares", "9 de julio", 2000, 50);
        i1 = new Internacional(LocalDate.of(2024, 8, 10), "Carlos Casrares", "Montevideo", 2000);
        l1 = new Local(LocalDate.of(2023,10,10),"Carlos Casares", "Calos Casares", 300, true);
    }

    @Test
    void testAddEnvio(){
        cf.addEnvio(u1);
        assertEquals(1,cf.getMisEnvios().size());
    }

    @Test
    void testMontoAPagar(){
        DateLapse lapso = new DateLapse(LocalDate.of(2024,1,1), LocalDate.now());
        cf.addEnvio(u1); cf.addEnvio(i1); cf.addEnvio(l1);
        assertEquals(62100,cf.montoAPagar(lapso));
    }

}
