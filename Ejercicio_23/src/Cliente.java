import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Pedido> pedidos;

    //Constructor
    public Cliente(String nombre, String direccion){
        super(nombre,direccion);
        this.pedidos = new ArrayList<Pedido>();
    }

    //Getter
    public List<Pedido> getPedidos() {
        return this.pedidos;
    }

    /*
    Este metodo agrega un pedido al cliente
     */
    public boolean addPedido(FormaDePago fP, MetodoEnvio mE,Producto p, int cant, Vendedor v){
        if (p.hayStock(cant)){
            Pedido pedido = new Pedido(v,cant,p,fP,mE);
            this.pedidos.add(pedido);
            return true;
        }else {
            return false;
        }
    }

    /*
    Este metodo retorna una BAG de con todos los pedidos por categoria
     */
    public BagImpl<String> getCategoriasPedidos(){
        BagImpl<String> bolsa = new BagImpl<String>();
        this.pedidos.stream().forEach(p -> bolsa.add(p.getProducto().getCategoria()));
        return bolsa;
    }
}
