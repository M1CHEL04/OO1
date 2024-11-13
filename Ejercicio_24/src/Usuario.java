public abstract class Usuario {
    private String nombre;
    private double saldo;

    public Usuario (String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Getter
    public double getSaldo(){
        return this.saldo;
    }

    /*
    Este metodo carga saldo al usuario que coresponde.
     */
    public void cargarSaldo(double saldo){
        this.saldo += saldo - saldo * this.comision();
    }

    /*
    Este metodo retorna la comision correspondiente que se le debe cobrar al usuario
    al momento de cargar saldo
     */
    public abstract double comision();


    /*
    Este metodo cobra el costo del viaje al usuario (Le resta el costo)
     */
    public abstract double cobrar(double precio);

    protected void descontarSaldo(double monto){
        this.saldo-=monto;
    }
}
