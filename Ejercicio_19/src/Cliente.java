import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direcccion;
    private List<Envio> misEnvios;

    //Constructor
    public Cliente (String nombre, String direcccion){
        this.nombre= nombre;
        this.direcccion= direcccion;
        this.misEnvios= new ArrayList<Envio>();
    }

    //Getter
    public List<Envio> getMisEnvios(){
        return this.misEnvios;
    }

    /*
    Este metodo se tiene que hacer de esta forma o recibe un cliente tambien?
    Este metodo agrega un envio determinado a un cliente;
     */
    public void addEnvio (Envio e){
        this.misEnvios.add(e);
    }

    /*
    Este metodo retorna el monto a pagar de los envios dentro de un
    lapso de tiempo determinado
     */
    public double montoAPagar(DateLapse fechas){
        return this.misEnvios.stream()
                .filter(envio -> fechas.includesDate(envio.getFecha()))
                .mapToDouble(envio -> envio.monto()).sum() * this.descuento();
    }

    public abstract double descuento ();
}
