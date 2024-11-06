import java.time.LocalDate;

public abstract class Contrato {
    private LocalDate fechaInicio;

    public Contrato(LocalDate fechaInicio){
        this.fechaInicio=fechaInicio;
    }

    //Getter
    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }

    /*
    Este metodo retorna el monto basico del contrato
     */
    abstract double getBasico();

    /*
    Cual es la minima para la duracion de un contrato
    (Use años)
     */
    abstract int getDuracion();

    /*
    Este metodo retorna si esta o no vencido un contrato
     */
    abstract boolean noVencido();
}
