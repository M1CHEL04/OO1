import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class DePlanta extends Contrato{
    private double valorXMes;
    private double montoHijo;
    private double montoConyuge;
    private boolean conyuge;
    private boolean hijo;

    public DePlanta (LocalDate fechaInicio, double valorXMes, double montoConyuge, double montoHijo, boolean conyuge, boolean hijo){
        super(fechaInicio);
        this.valorXMes = valorXMes;
        this.montoConyuge = montoConyuge;
        this.montoHijo = montoHijo;
        this.conyuge = conyuge;
        this.hijo = hijo;
    }

    /*
    Este metodo retorana el sueldo basico del empleado
     */
    public double getBasico(){
        double aux = this.valorXMes;
        if(this.conyuge){
            aux+= this.montoConyuge;
        }
        if (this.hijo){
            aux+= this.montoHijo;
        }
        return aux;
    }

    /*
    Este metodo retorna la antiduedad del  (Meses)
     */
    public int getDuracion(){
        return (int) ChronoUnit.MONTHS.between(this.getFechaInicio(), LocalDate.now());
    }

    /*
    Este metodo retorna siempre true ya que los contratos de planta
    nuncan vencen
     */
    public boolean noVencido(){
        return true;
    }
}
