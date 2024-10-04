import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 implements DateLapseOverrall {
    private LocalDate from;
    private int sizeInDays;

    //Constructor
    public DateLapse2(LocalDate desde, int cantDias){
        this.from = desde;
        this.sizeInDays = cantDias;
    }

    //Getters
    public LocalDate getFrom() {
        return from;
    }
    public int getSizeInDays() {
        return sizeInDays;
    }

    /*
    El siguiente metodo retorna la fecha que hay desde la fecha "Desde"
    teniendo en cuenta la cantidad de dias que pasaron
     */
    public LocalDate getDateTo(){
        return this.from.plus(this.sizeInDays,ChronoUnit.DAYS);
    }

    /*
    El siguiente metodo evalua si la fecha pasada por parametro se encuentra
    o no en el rango de tiempo.
     */
    public boolean includesDate(LocalDate d){
        return ((d.isAfter(this.from) || d.isEqual(this.from))
                && (d.isBefore(this.getDateTo()) || d.isEqual(this.getDateTo())));
    }

}
