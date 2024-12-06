import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Pasajero extends Usuario{
    private List<Viaje> misViajes;

    //Constructor
    public Pasajero (String nombre, double saldo){
        super(nombre,saldo);
        this.misViajes = new ArrayList<Viaje>();
    }

    //Getter
    public List<Viaje> getMisViajes(){
        return this.misViajes;
    }

    /*
    Este metodo retorna la comision que se le debe cobrar al pasajero a la hora de
    cargar saldo
     */
    public double comision(){
        return  this.misViajes.stream().filter( v -> v.fueEnHace30Dias())
                .findFirst().orElse(null) != null ? 0 : 0.1 ;

    }

    /*
    Este metodo realiza el cobro del viaje (Descuenta el saldo)
     */
    public double cobrar(double precio){
        if(this.misViajes.size() > 0){
            precio-=500;
        }
        this.descontarSaldo(precio);
        return precio;
    }

    /*
    Este metodo agrega si es posible un pasajero al viaje
     */
    public boolean anotarseViaje(Viaje v){
        if(this.getSaldo() > 0 && v.addIntegrante(this)){
            this.misViajes.add(v);
            return true;
        }else {
            return false;
        }
    }
}
