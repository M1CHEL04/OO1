import java.util.*;
public class ReporteDeConstruccion {
    List<Pieza> piezas;

    public ReporteDeConstruccion (){
        piezas = new ArrayList<Pieza>();
    }

    //Metodo que agrega una pieza al reporte
    public void addPieza(Pieza p){
        this.piezas.add(p);
    }

    /*
    Metodo que retorna el volumen de todas las piezas
    de un material especifico.
     */
    public double getVolumenDeMaterial(String material){
         return this.piezas.stream().filter(pieza -> pieza.getMaterial().equals(material)).
                mapToDouble(pieza -> pieza.getVolumen()).sum();
    }

    public double getSuperficieDeColor(String color){
        return this.piezas.stream().filter(pieza -> pieza.getColor().equals(color)).
                mapToDouble(pieza -> pieza.getSuperficie()).sum();
    }
}
