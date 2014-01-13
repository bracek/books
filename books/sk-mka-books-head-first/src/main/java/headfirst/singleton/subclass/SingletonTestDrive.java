package headfirst.singleton.subclass;

public class SingletonTestDrive {
	public static void main(final String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
