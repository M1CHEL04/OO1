public class Esfera extends Pieza {
    int radio;

    public Esfera (String material, String color, int radio){
        super(material,color);
        this.radio=radio;
    }

    //getters y setters
    public int getRadio() {
        return this.radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    //Metodo que retorna el volumen de una esfera
    public double getVolumen(){
        return (((double) 4 /3) * Math.PI * Math.pow(this.getRadio(),3));
    }

    //Metodo que retorna la superfice de una esfera
    public double getSuperficie(){
        return (4 * Math.PI * Math.pow(this.getRadio(),2));
    }
}
