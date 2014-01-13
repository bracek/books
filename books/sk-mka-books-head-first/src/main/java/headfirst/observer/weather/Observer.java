package headfirst.observer.weather;

public interface Observer {
	public void update(final float temp,
final  float humidity,
final  float pressure);
}
