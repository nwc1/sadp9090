import java.util.*;

class MyEnumeratorAdapter<Object> implements Enumeration<Object> {

    private Iterator<Object> adaptee;

    public MyEnumeratorAdapter(Iterator<Object> it) {
        this.adaptee = it;
    }

    @Override
    public boolean hasMoreElements() {
        return adaptee.hasNext();
    }

    @Override
    public Object nextElement() {
        return adaptee.next();
    }

}

class MyArrayList<T> extends ArrayList<T> {

    public Enumeration<T> enumerator() {
        return new MyEnumeratorAdapter(this.iterator());
    }
}


class q2{

public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<String>();
        names.add("orange");
        names.add("apple");
        names.add("qiwi");

        for (Enumeration<String> iterator = names.enumerator(); 
		iterator.hasMoreElements();)
		 {
            		String name = (String) iterator.nextElement();
            		System.out.println(name);
        	}

   	 }
}
