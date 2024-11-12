import java.time.LocalDate;
import java.util.Date;

public class ConsultaMedica extends ServicioMedico{

    //Constructor
    public ConsultaMedica (Mascota mascota, Medico veterinario, LocalDate fechaDeAtencion){
        super(mascota,veterinario,fechaDeAtencion);
    }

    /*
    Este metodo calcula el costo de la consulta medica
     */
    public double calcularCostoServicio(){
        double costo = this.getVeterinario().getHonorarios() +
                300 + this.getVeterinario().calcularAntiguedad() * 100;
        if (this.esDomingo(this.getFechaDeAtencion())){
            costo+= 200;
        }
        return costo;
    }
}
