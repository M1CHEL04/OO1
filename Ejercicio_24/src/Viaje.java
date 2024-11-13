import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private LocalDate fecha;
    private String origen;
    private String destino;
    private double costo;
    private List<Usuario> integrantes;
    private Vehiculo vehiculo;

    //Constructor
    public Viaje(String origen, double costo, String destino, Conductor conductor, Vehiculo vehiculo, LocalDate fecha) {
        this.origen = origen;
        this.fecha = fecha;
        this.integrantes = new ArrayList<Usuario>();
        this.costo = costo;
        this.destino = destino;
        this.integrantes.add(conductor);
        this.vehiculo = vehiculo;
    }

    //getter
    public LocalDate getFecha() {
        return this.fecha;
    }
    public String getOrigen() {
        return this.origen;
    }
    public String getDestino() {
        return this.destino;
    }
    public double getCosto() {
        return this.costo;
    }
    public List<Usuario> getIntegrantes() {
        return this.integrantes;
    }

    /*
    Este metodo retorna true si el viaje se realizo en los ultimos 30 dias
     */
    public boolean fueEnHace30Dias(){
        return this.fecha.isAfter(LocalDate.now().minusDays(31)) && this.fecha.isBefore(LocalDate.now());
    }

    /*
    Este metodo agrega un Usuario al viaje si hay capacidad
     */
    public boolean addIntegrante(Usuario u){
        if(this.integrantes.size() <= this.vehiculo.getCapacidad() && ChronoUnit.DAYS.between(LocalDate.now(),this.fecha) >= 2){
            this.integrantes.add(u);
            return true;
        }else{
            return false;
        }
    }

    /*
    Este metodo procesa el viaje descontandoles el costo a cada uno
    de los inregrantes del mismo
     */

    public void procesarViaje(){
        double precioParcial = this.costo / this.integrantes.size();
        this.integrantes.stream().forEach(i -> i.cobrar(precioParcial));
    }
}
