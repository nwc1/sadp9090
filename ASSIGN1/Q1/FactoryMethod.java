import java.util.*;
public class FactoryMethod{
     static boolean b = true;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		PizzaFactory pf=new PizzaFactory();
do{System.out.println("Please Enter type of pizza you want:\n 1.NyStyleCheesePizza \n 2.ChicagoStyleCheesePizza \n3.Exit");
		int val =sc.nextInt();
		if(val==1){

			Pizza pizza=pf.getPizza("NyStyleCheesePizza");
			pizza.createPizza();
			pizza.orderPizza();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}

		else if(val==2){
			Pizza pizza=pf.getPizza("ChicagoStyleCheesePizza");
			pizza.createPizza();
			pizza.orderPizza();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
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
