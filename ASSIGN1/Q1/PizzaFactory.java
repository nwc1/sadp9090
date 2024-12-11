public class PizzaFactory{
	public Pizza getPizza(String pizzaType){
		if(pizzaType.equalsIgnoreCase("NyStyleCheesePizza")){
			return new NyStyleCheesePizza();
		}
		else if(pizzaType.equalsIgnoreCase("ChicagoStyleCheesePizza")){
			return new ChicagoStyleCheesePizza();

		}   
		else{
			return null;
		}
	}
}
