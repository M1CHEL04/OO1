package ar.edu.unlp.info.oo1.redAlumbrado;
import java.util.*;
import java.util.stream.Collectors;

public class Farola {
    //Variables de instacia
    private boolean state;
    private List <Farola> neighbors;

    /*Constructor
    * Crea la farola como apagada.
    */
    public Farola (){
        this.state=false;
        this.neighbors= new ArrayList<Farola>();
    }

    //Crea la relacion de vecinos entre farolas.
    public void pairWithNeighbor (Farola f){
        this.neighbors.add(f);
        if(!f.getNeighbors().contains(this)){
            f.pairWithNeighbor(this);
        }
    }

    //Retorna las farolas vecinas
    public List<Farola> getNeighbors(){
        return this.neighbors.stream().collect(Collectors.toList());
    }

    //Si la farola no esta encendida la enciende y propaga la accion
    public void turnOn(){
        if(!this.state){
            this.state=true;
            this.neighbors.stream().forEach(n -> n.turnOn());
        }
    }

    //S la farola esta prendida la apaga y propaga la accion
    public void turnOff(){
        if(this.state){
            this.state=false;
            this.neighbors.stream().forEach(n-> n.turnOff());
        }
    }

    public boolean isOn(){
        return this.state;
    }

    public boolean isOff(){
        return (!this.state);
    }
}
