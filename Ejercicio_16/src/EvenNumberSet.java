import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer> {

    //Constructor
    public EvenNumberSet(){
        super();
    }

    /*
    Este metodo agrega unicamente los valores pares
     */
    public boolean addNum (int num){
        if(num % 2 == 0){
            super.add(num);
            return true;
        }else{
            return false;
        }
    }
}
