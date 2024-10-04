public class PrismaRectangular extends Pieza {
    int ladoMayor;
    int ladoMenor;
    int altura;

    public PrismaRectangular (String material, String color, int ladoMayor, int ladoMenor, int altura){
        super(material,color);
        this.ladoMayor=ladoMayor;
        this.ladoMenor=ladoMenor;
        this.altura=altura;
    }

    //getters
    public int getLadoMayor() {
        return this.ladoMayor;
    }
    public int getLadoMenor() {
        return ladoMenor;
    }
    public int getAltura() {
        return this.altura;
    }

    //metodo que retorna el volumen de un prisma
    public double getVolumen(){
        return (this.getLadoMenor() * this.getLadoMayor() * this.getAltura());
    }

    //metodo que retorna la superficie de un prisma
    public double getSuperficie(){
        return (2 * ((this.getLadoMayor() * this.getLadoMenor()) + (this.getLadoMayor() * this.getAltura()) + (this.getLadoMenor() * this.getAltura())));
    }
}
