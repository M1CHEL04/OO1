import java.util.Date;

public class Reserva {
    private DateLapse2 lapso;
    private double precioTotal;

    public Reserva(DateLapse2 lapso, double precioTotal){
        this.lapso=lapso;
        this.precioTotal=precioTotal;
    }

    //Getters
    public double getPrecioTotal(){
        return this.precioTotal;
    }

    public DateLapse2 getLapso() {
        return this.lapso;
    }
}
