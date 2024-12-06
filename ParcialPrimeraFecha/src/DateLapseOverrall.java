import java.time.LocalDate;

/*
Consultar poruqe es necesario/que ventajas tiene en este enunciado
implementar una interfaz
 */

public interface DateLapseOverrall {
    public boolean includesDate(LocalDate d);

    public boolean overlaps (DateLapse anotherDateLapse);

    
}
