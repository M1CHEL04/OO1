import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class CuentaTest {

    CuentaCorriente cc;
    CajaDeAhorro cda;

    @BeforeEach
    void setUp() throws Exception{
        cc = new CuentaCorriente();
        cda = new CajaDeAhorro();

        cc.depositar(500);
        cda.depositar(300);
    }

    @Test
    void TestDepositar(){
        assertEquals(300,cda.getSaldo());
        assertEquals(500,cc.getSaldo());
    }

    @Test
    void TestExtraer(){
        cc.depositar(500);
        cda.depositar(100);

        assertTrue(cc.extraer(500));
        assertTrue(cda.extraer(100));
        assertFalse(cc.extraer(100000000));
        assertFalse(cda.extraer(1000000000));
    }

    @Test
    void TestTransferir(){
        
    }

}
