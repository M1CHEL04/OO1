import java.time.LocalDate;

public class Vehiculo {
    private String descripcion;
    private int añoFabricacion;
    private int capacidad;
    private double valorMercado;
    //private Conductor dueño;

    public boolean antiguedadMenor5(){
        return (LocalDate.now().getYear() - this.añoFabricacion) < 5;
    }

    public boolean hayCapacidad(int n){
        return this.capacidad > n;
    }

    public double getValorMercado(){
        return this.valorMercado;
    }
}
