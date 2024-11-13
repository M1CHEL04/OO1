import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private String especie;
    private LocalDate fechaDeNacimiento;
    private List<Servicio> servicios;

    //Constructor
    public Mascota (String nombre, String especie, LocalDate fechaDeNacimiento){
        this.nombre = nombre;
        this.especie = especie;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.servicios = new ArrayList<Servicio>();
    }

    //Getter
    public List<Servicio> getServicioMedicos() {
        return this.servicios;
    }

    /*
    Este metodo recibe un medico y crea una consulta medica para esta mascota
     */
    public ConsultaMedica darAltaConsultaMedica(Medico veterinario){
        ConsultaMedica consulta = new ConsultaMedica(this,veterinario,LocalDate.now());
        this.servicios.add(consulta);
        return consulta;
    }

    /*
    Este metodo recibe un medico, una vacuna y su costo. Para crear un vacunacion para
    esta mascota
     */
    public Vacunacion darAltaVacunacion(Medico veterinario,String vacuna, double costoVacuna){
        Vacunacion vacunacion = new Vacunacion(this,veterinario,LocalDate.now(),vacuna,costoVacuna);
        this.servicios.add(vacunacion);
        return vacunacion;
    }

    /*
    Este metodo recibe una cantidad de dias y crea una servicio de guarderia para esta mascota
     */
    public Guarderia darAltaGuarderia(int cantDias){
        Guarderia guarderia = new Guarderia(this,cantDias,LocalDate.now());
        this.servicios.add(guarderia);
        return guarderia;
    }

    /*
    Este metodo retorna los ingresos generados por esta mascota en una fecha especifica
     */
    public double montoGeneradoFecha(LocalDate fecha){
        return this.servicios.stream().filter(s -> s.esIgual(fecha))
                .mapToDouble(s -> s.calcularCostoServicio())
                .sum();
    }
}
