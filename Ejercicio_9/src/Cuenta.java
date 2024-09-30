public abstract class Cuenta {
    private double saldo;

    /*
    Constructor:
    Se instancia el obejeto con saldo=0
     */
    public Cuenta(){
        this.saldo=0;
    }

    //Retorna el saldo de la cuenta
    public double getSaldo(){
        return this.saldo;
    }

    //se incrementa el saldo de la cuenta
    public void depositar(double monto){
        this.saldo+=monto;
    }

    protected void extraerSinControlar(double monto){
        this.saldo-=monto;
    }

    public abstract boolean puedoExtraer(double monto);

    public boolean transferirACuenta(double monto,Cuenta destino){
       if(this.puedoExtraer(monto)) {
           this.extraerSinControlar(monto);
           destino.depositar(monto);
           return true;
       }else return false;
    }

    public boolean extraer (double monto){
        if (this.puedoExtraer(monto)){
            return true;
        }else return false;
    }

    /*
    Preguntar 9 -> C
     */

}
