public class Orco extends Personaje{

    public double getIncremento(int hora){
        return (hora < 8 || hora > 20) ? 1.6 : 1;
    }

    public boolean subeHabilidad() {
        return (this.getNivel() % 3 == 0) ;
    }
}
