package headfirst.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class Observable implements QuackObservable {
	ArrayList observers = new ArrayList();
	QuackObservable duck;
 
	public Observable(final QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(final Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator getObservers() {
		return observers.iterator();
	}
}
