public class Vehiculo {
    private Conductor dueño;
    private String desc;
    private int capacidad;
    private int modelo;
    private double valorMercado;

    //Constructor


    public Vehiculo(Conductor dueño, int modelo, double valorMercado, int capacidad, String desc) {
        this.dueño = dueño;
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.capacidad = capacidad;
        this.desc = desc;
    }

    //Getter
    public int getCapacidad(){
        return this.capacidad;
    }
    public Conductor getDueño(){
        return this.dueño;
    }
    public int getModelo(){
        return this.modelo;
    }
    public double getValorMercado(){
        return this.valorMercado;
    }

    //Set de conductor
    public void setDueño(Conductor c){
        this.dueño=c;
    }
}
