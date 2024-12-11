import java.util.*;
public class CarsMain{
 static boolean b = true;
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		CarsMain c = new CarsMain();

                do{
                  System.out.println("Enter your choice:\n 1.NorthAmerica \n 2.Europe \n 3.Exit");
		int val =sc.nextInt();
		if(val==1){
                        NorthAmerica cr = new NorthAmerica();
			
			cr.wheels();
			cr.headlights();
			cr.seats();
			cr.engine();
			
		}

		else if(val==2){
                        Europe cr = new Europe();
			cr.wheels();
			cr.headlights();
			cr.seats();
			cr.engine();
		}

                else if(val==3)
                 {
                    b = false;
                }
		else{
			System.out.println("Choose correct option");
		}
               }while(b);
		
}
}
