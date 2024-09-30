public class CuentaCorriente extends Cuenta {
    //variable de instacia
    private double descubierto;

    public CuentaCorriente (){
        super();
        this.descubierto=0;
    }

    public double getDescubierto(){
        return this.descubierto;
    }

    @Override
    public boolean puedoExtraer(double monto) {
        return ((this.getSaldo() - monto) >= this.descubierto);
    }
}
