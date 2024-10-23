public class Corporativo extends Cliente {
    private int cuit;

    //Constructor
    public Corporativo (String nombre, String direccion, int cuit){
        super(nombre,direccion);
        this.cuit=cuit;
    }

    //Getter
    public int getCuit(){
        return this.cuit;
    }

}
