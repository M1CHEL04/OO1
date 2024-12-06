public class Sede {
    private String nombre;
    private int cantDias;
    private double precioPorDia;

    public Sede (String nombre, int cantDias, double precioPorDia){
        this.cantDias = cantDias;
        this.precioPorDia = precioPorDia;
        this.nombre = nombre;
    }

    public double getPrecioSede(){
        return this.precioPorDia * this.cantDias;
    }
}
