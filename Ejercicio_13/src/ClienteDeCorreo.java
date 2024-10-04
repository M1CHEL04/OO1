import java.util.*;
public class ClienteDeCorreo {
    private List<Carpeta> carpetas;

    //Constructor
    public ClienteDeCorreo (){
        Carpeta inbox= new Carpeta("Inbox");
        this.carpetas = new ArrayList<Carpeta>();
        this.carpetas.add(inbox);
    }

    //Metodo que recibe un mail y lo guarda en la carpeta inbox
    public void recibir(Email mail){
        this.carpetas.getFirst().agregarMail(mail);
    }

    /*
    Metodo que retorna el primer mail que encuentra cuyo
    titulo o cuerpo contengan un string pasado por parametro.
     */
    public Email buscar(){
        return null;
    }

    /*
    Metodo que retorna el espacio ocupado por todos
    los mails almacenados en todas las carpetas
     */
    public int espacioOcupado(){
        return this.carpetas.stream().mapToInt(c -> c.espacioOcupado()).sum();
    }
}
