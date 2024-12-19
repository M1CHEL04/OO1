public class Mago implements Rol{

    public double getPoderBase(int nivel, double fuerza, double inteligencia){
        return (inteligencia + nivel) * 2;
    }

    public void subirHabilidad (Personaje p){
        p.incInteligencia();
    }


}
