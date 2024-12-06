import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presencial extends Evento{
    private List<Sede> sedes;

    public Presencial (String nombre, LocalDate fecha, String temaPrincipal,
        double precioInscripcion, double precioRemera){
        super(nombre,fecha,temaPrincipal,precioInscripcion,precioRemera);
        this.sedes = new ArrayList<Sede>();
    }

    public double getExtra(){
        return this.sedes.stream().mapToDouble(s->s.getPrecioSede()).sum();
    }
}
