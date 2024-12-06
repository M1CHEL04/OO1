import java.time.LocalDate;

public class Virtual extends Evento{
    private double precioEnvio;

    public Virtual(String nombre, LocalDate fecha, String temaPrincipal,
                   double precioInscripcion, double precioRemera, double precioEnvio){
        super(nombre,fecha,temaPrincipal,precioInscripcion,precioRemera);
        this.precioEnvio = precioEnvio;
    }

    public double getExtra(){
        return this.precioEnvio;
    }
}
