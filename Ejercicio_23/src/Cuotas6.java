public class Cuotas6 implements FormaDePago{

    /*
    Metodo que retornar el precio parcial que se debe pagar por
    elegir pago con 6 cuotas
     */
    public double getPrecioParcial(double precio){
        return precio * 1.2;
    }
}
