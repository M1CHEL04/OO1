public abstract class Persona {
    private String nombre;
    private String direccion;

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }

    public Persona (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
