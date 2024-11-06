import java.time.LocalDate;

public class ReciboDeSueldo {
    private String nombreCompleto;
    private int cuil;
    private int antiguedad;
    private LocalDate fechaEmision;
    private double monto;

    /*
    Esta clase tiene unicamente el constructor del recibo de sueldo
     */
    public ReciboDeSueldo(String nombreCompleto, int cuil, int antiguedad, double monto){
        this.nombreCompleto = nombreCompleto;
        this.cuil = cuil;
        this.antiguedad = antiguedad;
        this.monto = monto;
        this.fechaEmision=LocalDate.now();
    }
}
