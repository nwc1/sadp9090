import java.util.*;

interface Pizza {
   

    public String getName();

    public void prepare();

    public void bake();

    public void cut(); 
    public void box(); 

    public String toString(); 
}

class NyStyleCheesePizza implements Pizza {
	String name;
    	String dough;
    	String sauce;
    ArrayList toppings = new ArrayList();
    public NyStyleCheesePizza() {
        name = "NyStyleCheesePizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
	
	public String getName() {
        return name;
    }

	public void prepare() {
        System.out.println("\nPreparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name +"\n");
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("Dough : "+dough + "\n");
        display.append("Sauce : "+sauce + "\n");
	display.append("Toppings added in Pepperoni pizza : \n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) + "\n");
        }
        System.out.println(display.toString());
	return display.toString();
    }
}
class ChicagoStyleCheesePizza implements Pizza {
	String name;
    	String dough;
    	String sauce;
    	ArrayList toppings = new ArrayList();
    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyleCheesePizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

	public String getName() {
        return name;
    }

	public void prepare() {
        System.out.println("\nPreparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name +"\n");
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("Dough : "+dough + "\n");
        display.append("Sauce : "+sauce + "\n");
	display.append("Toppings added in Pepperoni pizza : \n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) + "\n");
        }
        System.out.println(display.toString());
	return display.toString();
    }
}

class VeggiePizza implements Pizza {
	String name;
    	String dough;
    	String sauce;
    	ArrayList toppings = new ArrayList();
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }

	public String getName() {
        return name;
    }

	public void prepare() {
        System.out.println("\nPreparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name + "\n");
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("Dough : "+dough + "\n");
        display.append("Sauce : "+sauce + "\n");
	display.append("Toppings added in Pepperoni pizza : \n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) + "\n");
        }
        System.out.println(display.toString());
	return display.toString();
    }
}

class PepperoniPizza implements Pizza {
	String name;
    	String dough;
    	String sauce;
    	ArrayList toppings = new ArrayList();
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }

	public String getName() {
        return name;
    }

	public void prepare() {
        System.out.println("\nPreparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name +"\n");
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("Dough : "+dough + "\n");
        display.append("Sauce : "+sauce + "\n");
	display.append("Toppings added in Pepperoni pizza : \n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) + "\n");
        }
        System.out.println(display.toString());
	return display.toString();
    }
}

class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("nystylecheese")) {
            pizza = new NyStyleCheesePizza();
		pizza.toString();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
		pizza.toString();
        } else if (type.equals("chicagostylecheese")) {
            pizza = new ChicagoStyleCheesePizza();
		pizza.toString();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
		pizza.toString();
        } 
        return pizza;
    }
}




class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}


class Factory{

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
	int pizzaName = 0;
        
 	Scanner sobj = new Scanner(System.in);
	System.out.println("============================\n"+"Welcome to Pizza Store"+"\n============================");

        while(pizzaName < 5)
	{
         	System.out.println("1) nystylecheese \n2) pepperoni \n3) chicagostylecheese \n4) veggie \n5) Exit");
		System.out.print("============================\n"+"Enter your choice : ");
        	pizzaName = sobj.nextInt();
		System.out.println("============================");
		switch(pizzaName)
		{
			case 1:
			{
				Pizza pizza = store.orderPizza("nystylecheese");
				System.out.println("We ordered a " + pizza.getName() + "\n");
				break;
			}
			case 2:
			{
				Pizza pizza = store.orderPizza("pepperoni");
				System.out.println("We ordered a " + pizza.getName() + "\n");
				break;
			}
			case 3:
			{
				Pizza pizza = store.orderPizza("chicagostylecheese");
				System.out.println("We ordered a " + pizza.getName() + "\n");
				break;
			}
			case 4:
			{
				Pizza pizza = store.orderPizza("veggie");
				System.out.println("We ordered a " + pizza.getName() + "\n============================");
				break;
			}
		}

	}
    }
}







