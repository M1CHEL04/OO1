import java.util.*;
public class ClienteDeCorreo {
    private List<Carpeta> carpetas;

    //Constructor
    public ClienteDeCorreo (){
        Carpeta inbox= new Carpeta("Inbox");
        this.carpetas = new ArrayList<Carpeta>();
        this.carpetas.add(inbox);
    }

    //Getter
    public List<Carpeta> getCarpetas(){
        return this.carpetas;
    }

    /*
    El siguiente metodo agrega una carpeta recibida por parametro al cliente
     */
    public void addCarpeta(Carpeta c){
        this.carpetas.add(c);
    }

    //Metodo que recibe un mail y lo guarda en la carpeta inbox
    public void recibir(Email mail){
        this.carpetas.getFirst().agregarMail(mail);
    }

    /*
    Metodo que retorna el primer mail que encuentra cuyo
    titulo o cuerpo contengan un string pasado por parametro.
     */
    public Email buscar(String mail){
        return this.carpetas.stream().map(c -> c.buscar(mail)).
                filter(Objects::nonNull).findFirst().
                orElse(null);
    }

    /*
    Metodo que retorna el espacio ocupado por todos
    los mails almacenados en todas las carpetas
     */
    public int espacioOcupado(){
        return this.carpetas.stream().mapToInt(c -> c.espacioOcupado()).sum();
    }

    //Metodo que retorna la cantidad de mails que tiene el cliente de correo
    public int cantidadEmailsCliente(){
        return this.carpetas.stream().mapToInt(c -> c.cantEmailsCarpeta()).sum();
    }

    /*
    Cantidad de Emails en carpeta inbox
     */
}
