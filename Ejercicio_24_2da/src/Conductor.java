import java.time.LocalDate;

public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    public Conductor (String nombre, Vehiculo v){
        super(nombre);
        this.vehiculo = v;
    }

    public double comisionCargar(){
        return this.vehiculo.antiguedadMenor5() ? 0.01 : 0.1;
    }

    public Viaje darAltaViaje(String origen, String destino,
                              double costoTotal, LocalDate fecha){
        Viaje v = new Viaje(origen,destino,fecha,costoTotal,this,this.vehiculo);
        return v;
    }

    public double bonificacionDescontar(){
        return this.vehiculo.getValorMercado() * 0.01;
    }


}
