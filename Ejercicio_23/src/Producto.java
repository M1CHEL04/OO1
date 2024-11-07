public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    //Constructor
    public Producto(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    //Getter
    public String getNombre() {
        return this.nombre;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public double getPrecio() {
        return this.precio;
    }
    public int getStock() {
        return this.stock;
    }

    /*
    Este metodo retorna si posee el producto posee la cantidad solicitada
     */
    public boolean hayStock(int cant){
        return this.stock >= cant;
    }

    /*
    Este metodo descuenta la cantidad de productos indicada al stock
     */
    public int disminuirStock(int cant){
        return this.stock - cant;
    }
}
