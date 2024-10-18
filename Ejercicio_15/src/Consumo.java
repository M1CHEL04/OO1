public class Consumo {
    private double energiaActiva;
    private double energiaReactiva;

    //Constructor
    public Consumo (double energiaActiva, double energiaReactiva){
        this.energiaActiva = energiaActiva;
        this.energiaReactiva = energiaReactiva;
    }

    //Getters
    public double getEnergiaActiva() {
        return this.energiaActiva;
    }
    public double getEnergiaReactiva() {
        return this.energiaReactiva;
    }
}
