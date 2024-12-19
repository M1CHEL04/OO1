public class Guerrero implements Rol{

    public double getPoderBase(int nivel, double fuerza, double inteligencia){
        return (fuerza * 2) + nivel + inteligencia;
    }

    public void subirHabilidad (Personaje p){
        p.incFuerza();
        //p.getNivel()/6 como parametro -> no
    }
}
