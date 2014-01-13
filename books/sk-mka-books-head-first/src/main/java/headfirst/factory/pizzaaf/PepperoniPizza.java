package headfirst.factory.pizzaaf;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public PepperoniPizza(final PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
