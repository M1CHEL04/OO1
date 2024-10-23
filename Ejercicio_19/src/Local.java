import java.time.LocalDate;

public class Local extends Envio {
    private boolean rapido;

    //Constructor
    public Local(LocalDate fecha, String dOrigen, String dDestino, double peso, boolean rapido){
        super(fecha,dOrigen,dDestino,peso);
        this.rapido=rapido;
    }

    /*
    Este metodo calcula el valor del envio
     */
    public double monto(){
        if(this.rapido){
            return 1500;
        }else {
            return 1000;
        }
    }

}
