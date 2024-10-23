import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
    private LocalDate from;
    private LocalDate to;

    //Constructor
    public DateLapse (LocalDate inicio, LocalDate fin){
        this.from= inicio;
        this.to= fin;
    }

    //Getters
    public LocalDate getFrom() {
        return this.from;
    }
    public LocalDate getTo() {
        return this.to;
    }

    /*
    Este metodo retorna la cantidad de dias entre las fechas
    Esta bien que modifique el metodo para que retorne un tipo de dato long? Ya que
    si se usa un int se puede generar desbordamiento.
     */
    public int sizeInDays(){
        return (int) ChronoUnit.DAYS.between(this.from,this.to);
    }

    /*
    Este metodo recibe un fecha por parametro y retorna si esa fecha esta dentro
    del lapso de tiempo
     */
    public boolean includesDate(LocalDate d){
        return ((d.isAfter(this.from) || d.isEqual(this.from)) && (d.isBefore(this.to) || d.isEqual(this.to)));
    }

    /*
    Retorna  true si el periodo de tiempo ingresado se superpone con el
    recibido por parametro.
     */

}

