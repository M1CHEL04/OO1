import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseOverrall{
    private LocalDate dateFrom;
    private LocalDate dateTo;

    //Constructor
    public DateLapse (LocalDate inicio, LocalDate fin){
        this.dateFrom= inicio;
        this.dateTo= fin;
    }

    //Getters
    public LocalDate getFrom() {
        return this.dateFrom;
    }
    public LocalDate getDateTo() {
        return this.dateTo;
    }

    /*
    Este metodo retorna la cantidad de dias entre las fechas
    Esta bien que modifique el metodo para que retorne un tipo de dato long? Ya que
    si se usa un int se puede generar desbordamiento.
     */
    public int sizeInDays(){
        return (int) ChronoUnit.DAYS.between(this.dateFrom,this.dateTo);
    }

    /*
    Este metodo recibe un fecha por parametro y retorna si esa fecha esta dentro
    del lapso de tiempo
     */
    public boolean includesDate(LocalDate d){
        return ((d.isAfter(this.dateFrom) || d.isEqual(this.dateFrom)) && (d.isBefore(this.dateTo) || d.isEqual(this.dateTo)));
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

