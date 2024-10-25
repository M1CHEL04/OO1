import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Propiedad {
    private String direccion;
    private String nombreDesc;
    private double precioXNoche;
    private List<Reserva> misReservas;

    //Constructor
    public Propiedad (String direccion, String nombreDesc, double precioXNoche){
        this.direccion=direccion;
        this.nombreDesc=nombreDesc;
        this.precioXNoche=precioXNoche;
        this.misReservas= new ArrayList<Reserva>();
    }

    //Getter
    public List<Reserva> getMisReservas(){
        return this.misReservas;
    }

    /*
    Este metodo crea una reserva
     */
    public void crearReserva(DateLapse2 lapso){
        Reserva r = new Reserva(lapso,lapso.getSizeInDays() * this.precioXNoche);
        this.misReservas.add(r);
    }

    /*
    Este metodo recibe una reserva por parametro y si la encuentra la cancela
     */
    public void cancelarReserva(Reserva r){
        this.misReservas.remove(r);
    }

    /*
    Este metodo consulta la disponibilidad de una propiedad en un lapso de tiempo
    recibido por parametro
     */
    public boolean consultarDisponibilidad(DateLapse l){
        List<Reserva> aux= this.misReservas.stream().filter(reserva -> reserva.getLapso()
                .overlaps(l))
                .collect(Collectors.toList());
        return aux.isEmpty();
    }

    /*
    Este metodo calcula todos los ingresos generados por esta propiedad
     */
    public double montoGenerado(DateLapse lapso){
        return (this.misReservas.stream().filter(reserva -> reserva.getLapso()
                                .includesDate(lapso.getFrom()))
                .mapToDouble(Reserva::getPrecioTotal)
                .sum()) * 0.75;
    }
}
