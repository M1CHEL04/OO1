import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Pedido pedido1,pedido2,pedido3;
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
        this.pedido1 = new Pedido(vendedor,2,producto1,pago,envio);
        this.pedido2 = new Pedido(vendedor,5,producto2,pago,envio);
        this.pedido3 = new Pedido(vendedor,1,producto2,pago,envio);
        this.cliente = new Cliente("Carlos Solari","Pabello 7mo");
    }

    @Test
    void addPedidoTest(){
        assertTrue(cliente.addPedido(pedido1.getFormaDePago(),pedido1.getMetodoEnvio(),pedido1.getProducto(),pedido1.getCantidadSolicitada(),pedido1.getV()));
        assertFalse(cliente.addPedido(pedido2.getFormaDePago(),pedido2.getMetodoEnvio(),pedido2.getProducto(),pedido2.getCantidadSolicitada(),pedido2.getV()));
    }

    @Test
    void getCategoriasPedidosTest(){
        cliente.addPedido(pedido1.getFormaDePago(),pedido1.getMetodoEnvio(),pedido1.getProducto(),pedido1.getCantidadSolicitada(),pedido1.getV());
        cliente.addPedido(pedido2.getFormaDePago(),pedido2.getMetodoEnvio(),pedido2.getProducto(),pedido2.getCantidadSolicitada(),pedido2.getV());
        cliente.addPedido(pedido3.getFormaDePago(),pedido3.getMetodoEnvio(),pedido3.getProducto(),pedido3.getCantidadSolicitada(),pedido3.getV());
        BagImpl<String> bolsa = cliente.getCategoriasPedidos();
        assertEquals(1,bolsa.occurrencesOf("Tecnologia"));
        assertEquals(1,bolsa.occurrencesOf("Hogar"));
    }
}
