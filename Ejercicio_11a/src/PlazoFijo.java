import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones {

    //Variables de instacia
    private LocalDate fechaInicio;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    //Contructor
    public PlazoFijo(double montoDepositado,double porcentajeDeInteresDiario){
        this.fechaInicio=LocalDate.now();
        this.montoDepositado=montoDepositado;
        this.porcentajeDeInteresDiario=porcentajeDeInteresDiario;
    }

    //Getters y setters
    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }
    public double getMontoDepositado() {
        return this.montoDepositado;
    }
    public void setMontoDepositado(double montoDepositado) {
        this.montoDepositado = montoDepositado;
    }
    public double getPorcentajeDeInteresDiario() {
        return this.porcentajeDeInteresDiario;
    }
    public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    //Este metodo retorna la el monto final de retiro del plazo fijo
    @Override
    public double calcularMonto() {
        int diasDiferencia = (int) ChronoUnit.DAYS.between(LocalDate.now(),this.fechaInicio);
        return (this.getMontoDepositado() * this.getPorcentajeDeInteresDiario() * diasDiferencia) + this.getMontoDepositado();
    }

}
