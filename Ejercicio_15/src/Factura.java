import java.time.LocalDate;

public class Factura {
    //Variables de instancia
    private Usuario cliente;
    private LocalDate fecha;
    private CuadroTarifario cuadroTarifario;

    //Constructor
    public Factura(Usuario u, CuadroTarifario c){
        this.cliente=u;
        this.cuadroTarifario=c;
        this.fecha=LocalDate.now();
    }

    /*
    Este metodo retorna el monto final a pagar
     */
    public double montoFinal(){
        if (this.tieneBonificacion()){
            return (this.calcularMontoPagar() - (this.calcularMontoPagar() * 0.1));
        }else{
            return (calcularMontoPagar());
        }
    }

    /*
    Este metodo calcula el monto que debe pagar un cliente
     */
    private double calcularMontoPagar(){
        return this.cliente.getConsumos().getLast().getEnergiaActiva() * this.cuadroTarifario.getValor();
    }

    /*
    Este metodo calcula si se le brinda o no una bonificacion al cliente
     */
    private boolean tieneBonificacion(){
        return this.calcularFactorPotencia() > 0.8;
    }

    /*
    Este metodo calcula el factor potencia
     */
    private double calcularFactorPotencia(){
        Consumo ultimoConsumo= this.cliente.getConsumos().getLast();
        return (ultimoConsumo.getEnergiaActiva()/
                Math.sqrt( Math.pow(ultimoConsumo.getEnergiaActiva(),2) + Math.pow(ultimoConsumo.getEnergiaReactiva(),2)));
    }
}
