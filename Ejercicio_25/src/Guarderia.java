import java.time.LocalDate;

public class Guarderia extends Servicio{
    private DateLapse2 lapso;

    //Constructor
    public Guarderia(Mascota mascota, int cantDias, LocalDate fechaInicio){
        super(mascota);
        this.lapso = new DateLapse2(fechaInicio,cantDias);
    }

    /*
    Este metodo retorna si la fecha que se recibe por parametro esta dentro del lapso
     */
    public boolean esIgual(LocalDate fecha){
        return this.lapso.includesDate(fecha);
    }

    /*
    Este metodo calcula el costo del servicio de guarderia
     */
    public double calcularCostoServicio(){
        double costo = this.lapso.getSizeInDays() * 500;
        if(this.getMascota().getServicioMedicos().size() >= 5){
            costo = costo * 0.9;
        }
        return costo;
    }
}
