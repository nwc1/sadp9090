import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;



class InputStreamDecorator extends FilterInputStream 
{
	protected InputStreamDecorator(InputStream in) 
	{
		super(in);
	}

	public int read() throws IOException 
	{
  		int c = super.read();
  		return (c == -1 ? c : Character.toLowerCase((char) c));
		
		/*if(Character.isLowerCase((char) c))
		{
			return c;
		}
		return Character.toLowerCase((char) c);*/
 	}
}


class Ass2q1 
{
	public static void main(String[] args) throws IOException 
	{
	  	int c;
	  	try
	 	{
			InputStream lovekesh = new InputStreamDecorator(new BufferedInputStream(new FileInputStream("/home/symsc43/Desktop/SADP/Assignment 2/Q1/sample.txt")));

		   	while ((c = lovekesh.read()) >= 0) 
			{
				System.out.print((char) c);
			}
		   	lovekesh.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
