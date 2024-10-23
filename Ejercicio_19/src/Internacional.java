import java.time.LocalDate;

public class Internacional extends Envio{

    //Constructor
    public Internacional (LocalDate fecha,String dOrigen, String dDestino, double monto){
        super(fecha,dOrigen,dDestino,monto);
    }

    /*
    Este metodo retorna el valor del envio
     */
    public double monto(){
        double valor;
        if (this.getPeso() < 1000){
            valor= 5000 + this.getPeso()*10;
        }else{
            valor= 5000 + this.getPeso()*12;
        }
        return valor;
    }
}
