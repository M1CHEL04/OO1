import java.time.LocalDate;

public abstract class Envio {
    private LocalDate fecha;
    private String dOrigen;
    private String dDestino;
    private double peso;

    //Constructor
    public Envio (LocalDate fecha, String dOrigen, String dDestino, double peso){
        this.dDestino=dDestino;
        this.dOrigen=dOrigen;
        this.fecha=fecha;
        this.peso=peso;
    }

    //Getters
    public LocalDate getFecha() {
        return this.fecha;
    }
    public String getdOrigen() {
        return this.dOrigen;
    }
    public String getdDestino() {
        return this.dDestino;
    }
    public double getPeso() {
        return this.peso;
    }

    /*
    Este metodo calcula el monto a pagar de un envio
     */
    public abstract double monto();
}
