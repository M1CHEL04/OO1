public class Pedido {
    private Vendedor vendedor;
    private int cantidadSolicitada;
    private Producto producto;
    private FormaDePago formaDePago;
    private MetodoEnvio metodoEnvio;

    //Constructor;
    public Pedido(Vendedor v, int cantidadSolicitada, Producto p, FormaDePago f, MetodoEnvio m){
        this.formaDePago = f;
        this.metodoEnvio = m;
        this.producto = p;
        this.vendedor = v;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    //Getter
    public Vendedor getV() {
        return this.vendedor;
    }
    public int getCantidadSolicitada() {
        return this.cantidadSolicitada;
    }
    public Producto getProducto() {
        return this.producto;
    }
    public MetodoEnvio getMetodoEnvio() {
        return this.metodoEnvio;
    }
    public FormaDePago getFormaDePago() {
        return this.formaDePago;
    }

    /*
    Este metodo retorna el precio final del pedido
     */
    public double getPrecioFinal(String dirCliente){
        return formaDePago.getPrecioParcial(producto.getPrecio()) +
                metodoEnvio.getPrecioEnvio(vendedor.getDireccion(),dirCliente);
    }
}
