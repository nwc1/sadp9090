import java.util.*;
import java.util.Vector;
import java.util.Enumeration;

class EnumerationIterator implements Iterator
{
	Enumeration ei;
	public EnumerationIterator(Enumeration ei) 
	{
		this.ei = ei;
	}
	public boolean hasNext() 
	{
		return ei.hasMoreElements();
	}
	public Object next() 
	{
		return ei.nextElement();
	}
	public void remove() 
	{
		throw new UnsupportedOperationException();
	}
}
public class Ass2q2
{
	public static void main(String args[])
	{
		Enumeration nums;
		Vector<String> vnum = new Vector<>();
		vnum.add("Loveksh");
		vnum.add("Akshay");
		vnum.add("Shoaib");
		nums = vnum.elements();
		EnumerationIterator ei = new EnumerationIterator(nums);
		while(ei.hasNext())
		{
			System.out.println(ei.next());
		}
	}
}
