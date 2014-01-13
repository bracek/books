package headfirst.combining.observer;

public class Quackologist implements Observer {
 
	public void update(final QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
