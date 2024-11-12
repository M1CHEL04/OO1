import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
    private String vacuna;
    private double costoVacuna;

    //Constructor
    public Vacunacion(Mascota mascota, Medico veterinario, LocalDate fechaDeAtencion,String vacuna, double costoVacuna){
        super(mascota,veterinario,fechaDeAtencion);
        this.costoVacuna = costoVacuna;
        this.vacuna = vacuna;
    }

    /*
    Este metodo calcula el valor de la vacunacion
     */
    public double calcularCostoServicio(){
        double costo = this.getVeterinario().getHonorarios() +
                500 + this.costoVacuna;
        if (this.esDomingo(this.getFechaDeAtencion())){
            costo+=200;
        }
        return costo;
    }
}
