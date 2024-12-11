import java.util.*;
public class Mobile{
       static boolean b = true;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		Mobile m=new Mobile();

                do{
               System.out.println("Enter your choice:\n 1.OnePlus \n 2.IPhone \n 3.Exit");
		int val =sc.nextInt();
		if(val==1){

			OnePlus o = new OnePlus();
			o.clickPhoto();
                        o.recordVideo();

		}

		else if(val==2){
			Iphone o = new Iphone();
			o.clickPhoto();
                        o.recordVideo();
		}
                else if(val==3)
                {
                      b = false;
                }
		else{
			System.out.println("Choose correct option");
		}}while(b);
		
		
 
	}

}
