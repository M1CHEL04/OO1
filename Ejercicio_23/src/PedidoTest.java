import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    private Pedido pedido;
    private Producto producto1;
    private Vendedor v;
    private Cuotas6 pago;
    private ADomicilio envio;

    @BeforeEach
    void setUp()throws Exception{
        this.producto1 = new Producto("Celular","Tecnologia",2000,4);
        this.v = new Vendedor("Santiago","Av 60");
        this.pago = new Cuotas6();
        this.envio = new ADomicilio();
        this.pedido = new Pedido(v,2,producto1,pago,envio);
    }

    @Test
    void getPrecioFinalTest(){
        assertEquals(2450,pedido.getPrecioFinal("aaa"));
    }
}
