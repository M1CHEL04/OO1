import java.util.*;
public class Persona {
    private int dni;
    private String nombre;
    private String direccion;
    private List<Propiedad> misPropiedades;

    //Constructor
    public Persona(int dni, String nombre, String direccion){
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.misPropiedades = new ArrayList<Propiedad>();
    }

    //Getter
    public List<Propiedad> getMisPropiedades(){
        return this.misPropiedades;
    }

    /*
    Este metodo calcula el monto recaudado de todas las propiedades de esta persona
     */
    public double calcularIngreso(DateLapse lapso){
        return this.misPropiedades.stream().
                mapToDouble(p -> p.montoGenerado(lapso)).sum();
    }

}
