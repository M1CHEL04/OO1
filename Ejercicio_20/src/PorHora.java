import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PorHora extends Contrato {
    private LocalDate fechaFin;
    private double valorXHora;
    private int cantHoras;

    public PorHora (LocalDate fechaInicio,LocalDate fechaFin,double valorXHora, int cantHoras){
        super(fechaInicio);
        this.valorXHora=valorXHora;
        this.cantHoras=cantHoras;
        this.fechaFin=fechaFin;
    }

    /*
    Este metodo retorna el sueldo basico
     */
    public double getBasico(){
        return this.cantHoras * this.valorXHora;
    }

    /*
    Este metodo retorna la duracion del contrato
    (Meses)
     */
    public int getDuracion(){
        return (int) ChronoUnit.MONTHS.between(this.getFechaInicio(),this.fechaFin);
    }

    /*
    Este metodo retorna si esta o no vencido un contrato
     */
    public boolean noVencido(){
        return this.fechaFin.isBefore(LocalDate.now()) ||
                this.fechaFin.isEqual(LocalDate.now());
    }
}
