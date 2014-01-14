package headfirst.combining.observer;

public interface QuackObservable {
	 void registerObserver(final Observer observer);
	 void notifyObservers();
}
