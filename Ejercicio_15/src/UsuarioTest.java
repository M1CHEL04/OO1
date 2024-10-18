import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    private Usuario u;
    private Consumo c;

    @BeforeEach
    void setUp() throws Exception{
        u = new Usuario("Santiago","Av 60");
        c = new Consumo(10,10);
    }

    @Test
    void TestAddConsumo(){
        u.addConsumo(c);
        assertEquals(1,u.getConsumos().size());
    }
}
