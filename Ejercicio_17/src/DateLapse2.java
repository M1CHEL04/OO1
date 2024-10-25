import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 {
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

    /*
    Este metodo retorna true si el parametro de tiempo del recptor se superpone
    con el recibido por parametro
     */
   public boolean overlaps (DateLapse lapso) {
       return ((lapso.includesDate(from)
               || lapso.includesDate(getDateTo())
               || (includesDate(lapso.getFrom())
               || includesDate(lapso.getTo()))));
   }
}
