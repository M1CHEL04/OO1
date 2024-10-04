import java.util.*;
public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    //Constructor
    public Email (String titulo, String cuerpo){
        this.cuerpo=cuerpo;
        this.titulo=titulo;
        this.adjuntos = new ArrayList<Archivo>();
    }

    //getter
    public String getTitulo() {
        return this.titulo;
    }
    public String getCuerpo() {
        return this.cuerpo;
    }
    public List<Archivo> adjuntos(){
        return this.adjuntos;
    }

    //Metodo que recibe un archivo y lo agrega a un mail
    public void addArchivo(Archivo a){
        this.adjuntos.add(a);
    }

    //Metodo que retorna el tamaño de un email.
    public int tamaño(){
        return this.cuerpo.length() + this.titulo.length() + adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
    }

}
