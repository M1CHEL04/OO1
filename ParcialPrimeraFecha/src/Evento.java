import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Evento {
    private String nombre;
    private LocalDate fecha;
    private String temaPrincipal;
    private double precioInscripcion;
    private double precioRemera;

    public Evento(String nombre, LocalDate fecha, String temaPrincipal,
                  double precioInscripcion, double precioRemera){
        this.nombre = nombre;
        this.fecha = fecha;
        this.temaPrincipal = temaPrincipal;
        this.precioInscripcion = precioInscripcion;
        this.precioRemera = precioRemera;
    }

    //getters
    public LocalDate getFecha() {
        return this.fecha;
    }
    public double getPrecioInscripcion() {
        return this.precioInscripcion;
    }
    public double getPrecioRemera() {
        return this.precioRemera;
    }

    public double getPrecioParcial(){
        return this.precioInscripcion + this.precioRemera;
    }

    public abstract double getExtra();

    public double getPrecioFinal(){
        return this.getPrecioParcial() + this.getExtra();
    }

    public double getPrecioAsistencia(LocalDate fecha){
        if (this.fecha.isEqual(fecha)){
            return this.getPrecioFinal() * 1.2;
        }else{
            return this.getPrecioFinal();
        }
    }

    public int getDiferenciaDias(){
        return (int) ChronoUnit.DAYS.between(LocalDate.now(),this.fecha);
    }

    public boolean estoyEnRango(DateLapse lapso){
        return lapso.includesDate(this.fecha);
    }

    public boolean esDespues(){
        return this.fecha.isAfter(LocalDate.now()) ||
                this.fecha.isEqual(LocalDate.now());
    }

}
