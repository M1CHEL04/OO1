import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombreCompleto;
    private int cuil;
    private boolean poseeHijo;
    private boolean poseeConyuge;
    private List<Contrato> contratos;

    public Empleado(String nombreCompleto, int cuil, boolean poseeConyuge, boolean poseeHijo) {
        this.nombreCompleto = nombreCompleto;
        this.cuil = cuil;
        this.poseeHijo = poseeHijo;
        this.poseeConyuge = poseeConyuge;
        this.contratos = new ArrayList<Contrato>();
    }

    //Getters
    public List<Contrato> getContratos() {
        return this.contratos;
    }
    public boolean isPoseeHijo() {
        return this.poseeHijo;
    }
    public boolean isPoseeConyuge() {
        return this.poseeConyuge;
    }

    //Este metodo calcula la antiguedad de los empleados
    public int getAntiguedad() {
        return (this.contratos.stream().mapToInt(c -> c.getDuracion()).sum()) / 12;
    }

    /*
    Este metodo genera el recibo de sueldo del empleado
     */
    public ReciboDeSueldo getReciboSueldo() {
        ReciboDeSueldo r = new ReciboDeSueldo(this.nombreCompleto, this.cuil, this.getAntiguedad(), this.getSueldo());
        return r;
    }

    /*
    Este metodo calcula el sueldo de un empleado
     */
    public double getSueldo() {
        double sueldo = this.getContratoValidoBasico();
        int ant = this.getAntiguedad();
        if( ant == 5){
            sueldo+= sueldo * 1.3;
        }else if( ant > 5 && ant <= 10 ){
            sueldo+= sueldo * 1.5;
        }else if( ant > 10 && ant <= 15){
            sueldo+= sueldo *1.75;
        }else if( ant > 20){
            sueldo+=sueldo;
        }
        return sueldo;
    }

    /*
    Este metodo retorna el sueldo base del unico contrato no vencido
     */
    private double getContratoValidoBasico(){
        Contrato contrato = this.contratos.stream().filter(c -> c.noVencido())
                .findFirst().orElse(null);
        return contrato.getBasico();
    }

    /*
    Este metodo agrega un contrato al empleado
     */
    public void addContrato(Contrato c){
        this.contratos.add(c);
    }
}
