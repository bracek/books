package headfirst.combining.adapter;

public class GooseAdapter implements Quackable {
	Goose goose;
 
	public GooseAdapter(final Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
