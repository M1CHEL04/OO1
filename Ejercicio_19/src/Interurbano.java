import java.time.LocalDate;

public class Interurbano extends Envio {
    private double km;

    //Construcur
    public Interurbano (LocalDate fecha, String dOrigen, String dDestino, double peso, double km){
        super(fecha,dOrigen,dDestino,peso);
        this.km=km;
    }

    //Getter
    public double getKm() {
        return km;
    }

    /*
    Este metodo calcula el valor del envio
     */
    public double monto(){
        double valor;
        if(this.km <= 100){
            valor = this.getPeso() * 20;
        }else if( this. km > 100 && this.km <= 500){
            valor = this.getPeso() * 25;
        }else{
            valor = this.getPeso() * 30;
        }
        return valor;
    }
}
