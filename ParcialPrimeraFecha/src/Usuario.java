import jdk.jfr.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Entrada> entradas;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.entradas = new ArrayList<Entrada>();
    }

    public Entrada comprarEntrada (Evento e, boolean seguro){
        double precio = e.getPrecioAsistencia(LocalDate.now());
        if(seguro){
            precio+=500;
        }
        Entrada entrada = new Entrada(seguro,e,precio);
        this.entradas.add(entrada);
        return entrada;
    }

    public double montoTotalEntradas(DateLapse lapso){
        return this.entradas.stream().filter(e-> e.estoyEnRango(lapso)).
                mapToDouble(e->e.getPrecio()).sum();
    }

    public Entrada proximoEvento(){
        return this.entradas.stream().
                filter(e->e.esDespues()).min((e1,e2)->
                        Integer.compare(e1.cuantosDiasFaltan(), e2.cuantosDiasFaltan()))
                    .orElse(null);
    }
}
