import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String origen;
    private String destino;
    private LocalDate fecha;
    private double costoTotal;
    private Vehiculo vehiculo;
    private List<Usuario> integrantes;

    public Viaje(String origen, String destino, LocalDate fecha,
                 double costoTotal, Conductor conductor, Vehiculo vehiculo){
        this.fecha = fecha;
        this.destino = destino;
        this.origen = origen;
        this.costoTotal = costoTotal;
        this.integrantes = new ArrayList<Usuario>();
        this.integrantes.add(conductor);
        this.vehiculo = vehiculo;
    }

    public boolean fueHace30Dias(){
        return this.fecha.isAfter(LocalDate.now().minusDays(31))
                && this.fecha.isBefore(LocalDate.now());
    }

    public boolean hayCapacidad(){
        return this.vehiculo.hayCapacidad(this.integrantes.size());
    }

    public boolean masDeDosDias(){
        return ChronoUnit.DAYS.between(LocalDate.now(),this.fecha) >= 2;
    }

    public boolean addIntegrante(Usuario u){
        if(this.hayCapacidad() && this.masDeDosDias()){
            this.integrantes.add(u);
            return true;
        }else{
            return false;
        }
    }

    public void procesarViaje(){
        double saldoCadaUno = this.costoTotal / this.integrantes.size();
        this.integrantes.stream().forEach(i-> i.descontarSaldo(saldoCadaUno));
    }
}
