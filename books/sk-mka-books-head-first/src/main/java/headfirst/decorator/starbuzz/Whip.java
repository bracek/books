package headfirst.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(final Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
