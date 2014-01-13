package headfirst.combining.observer;

public interface QuackObservable {
	public void registerObserver(final Observer observer);
	public void notifyObservers();
}
