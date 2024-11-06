import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
    private Empleado e1;
    private PorHora h1;
    private DePlanta p1;

    @BeforeEach
    void setUp() throws Exception{
        e1 = new Empleado("Santiago Michel",222,false,false);
        h1= new PorHora(LocalDate.of(2022,10,29),LocalDate.of(2023,10,29),100,5);
        p1= new DePlanta(LocalDate.of(2023,10,30),500,100,100,false,false);
        e1.addContrato(h1); e1.addContrato(p1);
    }

    @Test
    void getAntiguedadTest(){
        assertEquals(2,e1.getAntiguedad());
    }

    @Test
    void getSueldo(){
        assertEquals(500,e1.getSueldo());
    }

}