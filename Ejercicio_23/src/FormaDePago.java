public interface FormaDePago {
    /*
    Metodo que retorna como debe ser el precio segun la forma de pago seleccionada
     */
    public double getPrecioParcial(double precio);
}
