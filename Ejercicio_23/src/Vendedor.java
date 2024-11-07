import java.util.*;

public class Vendedor extends Persona{
    private List<Producto> productos;

    //Constructor
    public Vendedor (String nombre, String direccion){
        super(nombre,direccion);
        this.productos = new ArrayList<Producto>();
    }

    //gettter
    public List<Producto> getProductos() {
        return this.productos;
    }

    /*
    Este metodo agrega un producto a la lista de productos a vender
     */
    public boolean addProducto(Producto p){
        this.productos.add(p);
        return true;
    }
}
