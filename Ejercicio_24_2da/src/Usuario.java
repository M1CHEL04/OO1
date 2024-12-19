public abstract class Usuario {
    private String nombre;
    private double saldo;

    public Usuario (String nombre){
        this.nombre = nombre;
    }

    public void cargarSaldo(double saldo) {
        double saldoFinal = saldo - saldo * this.comisionCargar();
        this.saldo+= saldoFinal;
    }

    public abstract double comisionCargar();

    public double getSaldo(){
        return this.saldo;
    }

    public void descontarSaldo(double saldo){
        double saldoDescontar = saldo - this.bonificacionDescontar();
        this.descontarSaldoPriv(saldoDescontar);
    }

    public abstract double bonificacionDescontar();

    private void descontarSaldoPriv(double saldo){
        this.saldo-=saldo;
    }
}
