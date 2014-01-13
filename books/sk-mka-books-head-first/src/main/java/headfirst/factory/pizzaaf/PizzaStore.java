package headfirst.factory.pizzaaf;

public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(final String item);
 
	public Pizza orderPizza(final String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
