package headfirst.combining.observer;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(final Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	public void registerObserver(final Observer observer) {
		duck.registerObserver(observer);
	}
 
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
	public String toString() {
		return duck.toString();
	}
}
