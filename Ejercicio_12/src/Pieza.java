public abstract class Pieza {
    String material;
    String color;

    public Pieza(String material, String color){
        this.material= material;
        this.color= color;
    }

    //getters
    public String getMaterial() {
        return this.material;
    }
    public String getColor() {
        return this.color;
    }

    abstract double getVolumen();
    abstract double getSuperficie();
}
