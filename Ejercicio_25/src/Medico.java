import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medico {
    private String nombre;
    private LocalDate fechaDeIngreso;
    private double honorarios;

    //Constructor
    public Medico (String nombre, LocalDate fechaDeIngreso, double honorarios){
        this.fechaDeIngreso = fechaDeIngreso;
        this.honorarios = honorarios;
        this.nombre = nombre;
    }

    //getter
    public double getHonorarios(){
        return this.honorarios;
    }

    /*
    Este metodo retorna la antiguedad en años del medico
     */
    public int calcularAntiguedad() {
        return (int) ChronoUnit.YEARS.between(this.fechaDeIngreso, LocalDate.now());
    }
}
