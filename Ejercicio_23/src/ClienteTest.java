import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Producto producto1,producto2;
    private Contado pago;
    private RetiroComercio envio;
    private Cliente cliente;
    private Vendedor vendedor;

    @BeforeEach
    void setUp()throws Exception{
        this.producto1 = new Producto("Celular","Tecnologia",2000,4);
        this.producto2 = new Producto("Mesa","Hogar",1000,2);
        this.vendedor = new Vendedor("Santiago","Av 60");
        this.pago = new Contado();
        this.envio = new RetiroComercio();
        this.cliente = new Cliente("Carlos Solari","Pabellon 7mo");
    }

    @Test
    void addPedidoTest(){
        assertTrue(cliente.addPedido(pago,envio,producto1,2,vendedor));
        assertFalse(cliente.addPedido(pago,envio,producto2,5,vendedor));
    }

    @Test
    void getCategoriasPedidosTest(){
        cliente.addPedido(pago,envio,producto1,2,vendedor);
        cliente.addPedido(pago,envio,producto2,5,vendedor);
        cliente.addPedido(pago,envio,producto2,1,vendedor);
        BagImpl<String> bolsa = cliente.getCategoriasPedidos();
        assertEquals(1,bolsa.occurrencesOf("Tecnologia"));
        assertEquals(1,bolsa.occurrencesOf("Hogar"));
    }
}
