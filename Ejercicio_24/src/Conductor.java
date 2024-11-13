import java.time.LocalDate;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    //Constructor
    public Conductor(String nombre, double saldo, Vehiculo vehiculo){
        super(nombre,saldo);
        this.vehiculo = vehiculo;
    }

    /*
    Este metodo retorna el valor que se debe cobrar como comision al Conductor
    a la hora de cargar saldo
    */
    public double comision(){
        if ((LocalDate.now().getYear() - this.vehiculo.getModelo()) < 5 ){
            return 0.01;
        }else {
            return 0.1;
        }
    }

    /*
    Este metodo realiza el cobro del viaje (resta del saldo)
     */
    public double cobrar(double precio){
        precio -= this.vehiculo.getValorMercado() * 0.001;
        this.descontarSaldo(precio);
        return precio;
    }

    /*
    Este metodo crea un viaje
     */
    public Viaje crearViaje(String origen, String destino, double costoTotal, LocalDate fecha){
        if (ChronoUnit.DAYS.between(LocalDate.now(),fecha) >= 2) {
            Viaje v = new Viaje(origen, costoTotal, destino, this, this.vehiculo, fecha);
            return v;
        } else {
            return null;
        }
    }


}
