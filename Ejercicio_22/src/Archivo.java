public class Archivo {
    private String nombre;

    //constructor
    public Archivo (String nombre){
        this.nombre=nombre;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    //Metodo que retorna el tamaño de un archivo
    public int tamaño(){
        return this.nombre.length();
    }
}
