import java.util.*;
public class Inversor {
    //Variables de instancia
    private String nombre;
    private List <Inversiones> inversiones;

    //Constructor
    public Inversor (){

    }

    //metodo solicitado por el enunciado
    public double valorActual(){
        return inversiones.stream().mapToDouble(inv -> inv.calcularMonto()).sum();
    }
}
