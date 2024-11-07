import java.util.*;
import java.util.stream.Collectors;

public class Carpeta {
    private String nombre;
    private List<Email> emails;
    private Map<String,Integer> categoriaEmails;

    //constructor
    public Carpeta (String nombre){
        this.nombre=nombre;
        this.emails= new ArrayList<Email>();
    }

    //Getter
    public String getNombre() {
        return this.nombre;
    }

    public List<Email> getEmails(){
        return this.emails;
    }

    //Metodo que agrega un mail a un carpeta
    public void agregarMail(Email mail){
        this.emails.add(mail);
    }

    //Metodo que recibe un archivo y lo mueve a otra carperta;
    public void mover(Email mail, Carpeta destino){
        destino.agregarMail(mail);
        this.emails.remove(mail);
    }

    /*
    Metodo que retorna el primer mail que contiene en su titulo o
    cuerpo el string pasado por parametro
     */
    public Email buscar(String texto){
        return this.emails.stream().filter(email -> email.getTitulo().contains(texto) || email.getCuerpo().contains(texto)).
                findFirst().orElse(null);
    }

    //Metodo que retorna el espacio que ocupa la carpeta
    public int espacioOcupado (){
        return this.emails.stream()
                .mapToInt(e -> e.tamaño()).sum();
    }

    //Metodo que retorna la cantidad de mails que tiene la carpeta
    public int cantEmailsCarpeta(){
        return this.emails.size();
    }

    /*
    Este metodo retorna un objeto bag que almacena la categoria y
    las ocurrencias de cada categoria
     */
    public BagImpl<String> emailsPorTamaño(){
        BagImpl<String> bolsa = new BagImpl<>();
        this.emails.stream().forEach(e -> bolsa.add(e.clasificarPorTamaño()));
        return bolsa;
    }

}
