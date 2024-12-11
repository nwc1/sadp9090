import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class EnumerationIteratorAdapter<E> implements Iterator<E> {
    private final Enumeration<E> enumeration;

    public EnumerationIteratorAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}


public class Q2 {
    public static void main(String[] args) {
       
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

    
        Enumeration<String> enumeration = vector.elements();

        Iterator<String> iterator = new EnumerationIteratorAdapter<>(enumeration);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
