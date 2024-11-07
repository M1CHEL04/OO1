public class ADomicilio implements MetodoEnvio{

    /*
    Este metodo retorna el valor del medo de envio
     */
    public double getPrecioEnvio(String dir1, String dir2){
        return 0.5 * CalculadoraKilometros.getKilometros(dir1,dir2);
    }
}
