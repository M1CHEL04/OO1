public class Humano extends Personaje{

    public double getIncremento(int hora){
        return (hora > 8 && hora < 20) ? 1.4 : 1;
    }

    public boolean subeHabilidad() {
        return this.getNivel() > 7;
    }
}
