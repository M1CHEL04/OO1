public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(){
        super();
    }

    @Override
    public boolean puedoExtraer(double monto) {
        return ((this.getSaldo() - (monto * 1.02)) > 0);
    }
}
