import java.util.*;

public class Usuario {
    private String nombre;
    private String domicilio;
    private List <Consumo> consumos;

    //Constructor
    public Usuario(String nombre, String domicilio){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.consumos = new ArrayList<Consumo>();
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    public List<Consumo> getConsumos(){
        return this.consumos;
    }

    /*
    Este metodo agrega un consumo a la lista de consumo
     */
    public void addConsumo(Consumo c){
        this.consumos.add(c);
    }


}
