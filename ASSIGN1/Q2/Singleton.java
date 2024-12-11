public class Singleton 
{
	private static Singleton uniqueInstance;

	private Singleton() {}
	public static synchronized Singleton getInstance() 
	{
		if (uniqueInstance == null) 
		{
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	public  static void main(String args[])
	{
		Singleton s1= Singleton.getInstance();
		System.out.println("object 1: "+s1);
		Singleton s2= Singleton.getInstance();
		System.out.println("object 2: "+s2);	
	}
}







