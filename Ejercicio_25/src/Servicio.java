import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Servicio {
    private Mascota mascota;

    public Servicio (Mascota mascota){
        this.mascota = mascota;
    }

    //getter
    public Mascota getMascota() {
        return this.mascota;
    }

    /*
    Este metodo calcula el costo del honorario
    */
    public abstract double calcularCostoServicio();

    /*
    Este metodo retorna si la fecha recibida es igual o esta en el lapso
     */
    public abstract boolean esIgual(LocalDate fecha);

}
