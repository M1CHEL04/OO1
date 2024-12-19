import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario{
    private List<Viaje> misViajes;

    public Pasajero (String nombre){
        super(nombre);
        this.misViajes = new ArrayList<Viaje>();
    }

    public double comisionCargar(){
        return this.misViajes.stream().filter(v -> v.fueHace30Dias())
                .findFirst().orElse(null) != null ? 0 : 0.1;
    }

    public void registrarPasajero(Viaje v){
        if(this.getSaldo() > 0 && v.addIntegrante(this)){
            this.misViajes.add(v);
        }
    }

    public double bonificacionDescontar(){
        return this.misViajes.size() > 0 ? 500 : 0;
    }

}
