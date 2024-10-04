

import java.lang.Math;

public class Cilindro extends Pieza{
    int radio;
    int altura;

    public Cilindro (String material, String color, int radio, int altura){
        super(material,color);
        this.radio= radio;
        this.altura=altura;
    }

    //getters
    public int getRadio() {
        return this.radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public int getAltura() {
        return this.altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Metodo para retornar el volumen de un cilindro
    public double getVolumen(){
        return (Math.PI * Math.pow(this.getRadio(),2) * this.getAltura());
    }

    //Metodo para retornar la superfice de un cilindro
    public double getSuperficie(){
        return ((2 * Math.PI * this.getRadio()) + (2 * Math.PI * Math.pow(this.getRadio(),2)));
    }
}
