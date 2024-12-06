import java.time.LocalDate;
import java.util.Locale;

public class Entrada {
    private LocalDate fecha;
    private boolean seguro;
    private Evento evento;
    private double precio;

    public Entrada (boolean seguro, Evento e, double precio){
        this.fecha = LocalDate.now();
        this.seguro = seguro;
        this.evento = e;
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public double montoRetorna(){
        double monto = 0;
        if (seguro){
            monto+=this.evento.getPrecioFinal() * 0.15;
        }
        if (evento.getDiferenciaDias() >= 30){
            monto+=this.evento.getPrecioFinal() * 0.50;
        }
        return monto;
    }

    public boolean estoyEnRango(DateLapse lapso){
        return this.evento.estoyEnRango(lapso);
    }

    public boolean esDespues(){
        return this.evento.esDespues();
    }

    public int cuantosDiasFaltan(){
        return this.evento.getDiferenciaDias();
    }
}
