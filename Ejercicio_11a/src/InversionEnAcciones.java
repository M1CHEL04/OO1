public class InversionEnAcciones implements Inversiones{

    //Variables de instancia
    private String nombre;
    private int cantidad;
    private double valorUnitario;

    //Constructor
    public InversionEnAcciones(String nombre, int cant, double valorUnitario) {
        this.nombre=nombre;
        this.cantidad=cant;
        this.valorUnitario=valorUnitario;
    }

    //Getters y setters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getValorUnitario() {
        return this.valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    //Este metodo retorna el monto final de la accion
    @Override
    public double calcularMonto() {
        return this.getCantidad() * this.getValorUnitario();
    }
}
