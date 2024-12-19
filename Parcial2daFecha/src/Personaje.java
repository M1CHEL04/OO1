import java.util.List;
import java.util.stream.Collectors;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private double inteligencia;
    private double fuerza;
    private Rol rol;

    public void setRol(Rol nuevoRol){
        this.rol = nuevoRol;
    }
    public int getNivel(){
        return this.nivel;
    }
    public void incInteligencia(){
        this.inteligencia += this.nivel * (3/2);
    }
    public void incFuerza(){
        this.fuerza+= this.nivel/6;
    }

    //Metodos abstractos
    public abstract double getIncremento(int hora);
    public abstract boolean subeHabilidad();


    public double poderAtaque(int hora){
        return this.rol.getPoderBase(this.nivel,this.fuerza,this.inteligencia) *
                this.getIncremento(hora);
    }

    public void subirNivel(){
        this.nivel++;
        if (this.subeHabilidad()){
            rol.subirHabilidad(this);
        }
    }

    public void unoXuno (Personaje p, int hora){
        if (this.poderAtaque(hora) > p.poderAtaque(hora)){
            this.subirNivel();
        }else if (this.poderAtaque(hora) < p.poderAtaque(hora)){
            p.subirNivel();
        }else{
            this.subirNivel();
            p.subirNivel();
        }
    }

    public boolean esAdecuado(Personaje p){
        if(p.getNivel() == this.getNivel()){
            return this.poderAtaque(12) < 5;
        }else{
            int dif = this.getNivel() - p.getNivel();
            return Math.abs(dif) <= 2;
        }
    }

    public List<Personaje> buscarOponentes (List<Personaje> po){
        return po.stream().filter(p-> p.esAdecuado(this)).
                collect(Collectors.toList());
    }
}
