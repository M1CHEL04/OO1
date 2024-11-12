import java.beans.PropertyVetoException;
import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio {
    private Medico veterinario;
    private LocalDate fechaDeAtencion;

    public ServicioMedico (Mascota mascota, Medico veterinario, LocalDate fechaDeAtencion){
        super(mascota);
        this.veterinario = veterinario;
        this.fechaDeAtencion = fechaDeAtencion;
    }

    //getters
    public Medico getVeterinario(){
        return this.veterinario;
    }
    public LocalDate getFechaDeAtencion(){
        return this.fechaDeAtencion;
    }


    /*
    Este metodo calcula el costo del honorario
    */
    public abstract double calcularCostoServicio();

    /*
    Este metodo retorna si la fecha recibida es igual o esta en el lapso
     */
    public boolean esIgual(LocalDate fecha){
        return this.fechaDeAtencion.isEqual(fecha);
    }

    /*
    Este metodo retorna si la fecha recibida es un domingo o no
     */
    public boolean esDomingo(LocalDate fecha){
        return fecha.getDayOfWeek() == DayOfWeek.SUNDAY;
    }
}
