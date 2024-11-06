import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 implements DateLapseOverrall {
    private LocalDate dateFrom;
    private int sizeInDays;

    //Constructor
    public DateLapse2(LocalDate desde, int cantDias){
        this.dateFrom = desde;
        this.sizeInDays = cantDias;
    }

    //Getters
    public LocalDate getDateFrom() {
        return dateFrom;
    }
    public int getSizeInDays() {
        return sizeInDays;
    }

    /*
    El siguiente metodo retorna la fecha que hay desde la fecha "Desde"
    teniendo en cuenta la cantidad de dias que pasaron
     */
    public LocalDate getDateTo(){
        return this.dateFrom.plus(this.sizeInDays,ChronoUnit.DAYS);
    }

    /*
    El siguiente metodo evalua si la fecha pasada por parametro se encuentra
    o no en el rango de tiempo.
     */
    public boolean includesDate(LocalDate d){
        return ((d.isAfter(this.dateFrom) || d.isEqual(this.dateFrom))
                && (d.isBefore(this.getDateTo()) || d.isEqual(this.getDateTo())));
    }

    /*
    Este metodo retorna true si el parametro de tiempo del recptor se superpone
    con el recibido por parametro
     */
    public boolean overlaps (DateLapse lapso) {
        return ((lapso.includesDate(dateFrom)
                || lapso.includesDate(getDateTo())
                || (includesDate(lapso.getFrom())
                || includesDate(lapso.getDateTo()))));
    }
}
