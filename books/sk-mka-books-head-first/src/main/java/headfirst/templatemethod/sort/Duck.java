package headfirst.templatemethod.sort;

public class Duck implements Comparable {
	String name;
	int weight;
  
	public Duck(final String name,
final  int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	public String toString() {
		return name + " weighs " + weight;
	}
 
 
  
	public int compareTo(final Object object) {
 
		Duck otherDuck = (Duck)object;
  
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}
}
