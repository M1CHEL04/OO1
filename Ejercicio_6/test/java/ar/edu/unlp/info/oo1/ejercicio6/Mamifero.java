package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.Locale;

public class Mamifero {
    //Variables de instacia
    private String identificador;
    private String especie;
    private Locale fechaDeNacimiento;
    private Mamifero madre;
    private Mamifero padre;
    private Mamifero abueloMaterno;
    private Mamifero abueloPaterno;
    private Mamifero abuelaMaterna;
    private Mamifero abuelaPaterna;

    //Constructor
    public Mamifero(){
        this.madre=null;
        this.padre=null;
    }

    public Mamifero (String ident){
        this.identificador=ident;
        this.madre=null;
        this.padre=null;
    }

    //getters y setters
    public String getIdentificador() {
        return this.identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getEspecie() {
        return this.especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Locale getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(Locale fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public Mamifero getMadre() {
        return this.madre;
    }
    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }
    public Mamifero getPadre() {
        return this.padre;
    }
    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    //Metodos solicitados por el enunciado
    public Mamifero getAbuelaMaterna(){
        if(this.getMadre() != null){
            return this.getMadre().getMadre();
        }else{
            return null;
        }
    }

    public Mamifero getAbueloMaterno(){
        if(this.getMadre() != null){
            return this.getMadre().getPadre();
        }else{
            return null;
        }
    }

    public Mamifero getAbueloPaterno(){
        if(this.getPadre() != null){
            return this.getPadre().getPadre();
        }else{
            return null;
        }
    }

    public Mamifero getAbuelaPaterna(){
        if(this.getPadre() != null){
            return this.getPadre().getMadre();
        }else{
            return null;
        }
    }

    public boolean tieneComoAncestroA(Mamifero mamifero){
        boolean esAncestro = false;
        if (mamifero != null){
            esAncestro = tieneComoAncestroAPrivado(mamifero);
        }
        return esAncestro;
    }

    private boolean consultar (Mamifero m_a, Mamifero m){
        if(m.getMadre() == m_a){
            return true;
        }else return m.getPadre() == m_a;
    }

    /*
    private boolean loop (Mamifero m_a, Mamifero m){
        if(m.getMadre() != null){

        }
    }
     */

    private boolean tieneComoAncestroAPrivado(Mamifero mamifero){
        boolean esAncestro = false;

        esAncestro = consultar(mamifero,this);

        if(!esAncestro){
            if(this.getMadre()!=null){
                esAncestro = this.getMadre().tieneComoAncestroAPrivado(mamifero);
            }
            if(!esAncestro && this.getPadre()!=null){
                esAncestro = this.getPadre().tieneComoAncestroAPrivado(mamifero);
            }

        }

        return esAncestro;

    }
}
