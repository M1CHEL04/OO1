public class CuentaCorriente extends Cuenta {
    //variable de instacia
    private double descubierto;

    public CuentaCorriente (){
        super();
        this.descubierto=0;
    }

    public void setDescubierto(double monto){
        this.descubierto=monto;
    }

    public double getDescubierto(){
        return this.descubierto;
    }

    @Override
    public boolean puedoExtraer(double monto) {
        return ((this.getSaldo() - monto) >= this.descubierto);
    }
}
