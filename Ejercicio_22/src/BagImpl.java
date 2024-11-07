import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        // TODO Completar con la instanciación adecuada
        this.elements = new HashMap <T,Integer>();
    }

    @Override
    public boolean add(T element) {
        if(this.elements.containsKey(element)){
            this.elements.put(element,(this.elements.get(element) + 1));
        }else{
            this.elements.put(element,1);
        }
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        if (this.elements.get(element) == null){
            return 0;
        }else {
            return this.elements.get(element);
        }
    }

    @Override
    public void removeOccurrence(T element) {
        if (this.elements.containsKey(element)){
            if (this.elements.get(element) > 1){
                this.elements.put(element,this.elements.get(element) - 1);
            }else{
                this.elements.remove(element);
            }
        }
    }

    @Override
    public void removeAll(T element) {
        if (this.elements.containsKey(element)){
            this.elements.remove(element);
        }
    }

    @Override
    public int size() {
        /*
        int suma = 0;
        for (int value : this.elements.values()){
            suma += value;
        }
        return suma;
         */
       return this.elements.entrySet().stream()
               .mapToInt(e -> e.getValue()).sum();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
