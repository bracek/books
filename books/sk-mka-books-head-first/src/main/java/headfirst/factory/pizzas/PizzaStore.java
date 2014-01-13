package headfirst.factory.pizzas;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(final SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(final String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
