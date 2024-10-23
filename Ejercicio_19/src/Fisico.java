public class Fisico extends Cliente {
    private int dni;

    //Constructor
    public Fisico (String nombre, String direccion, int dni){
        super(nombre,direccion);
        this.dni=dni;
    }

    //Getter
    public int getDni(){
        return this.dni;
    }
    /*
    Este metodo sobre escribre el metodo de calcular monto del Cliente
     */
    public double montoAPagar(DateLapse lapso){
        double parcial = super.montoAPagar(lapso);
        return parcial - parcial * 0.1;
    }
}
