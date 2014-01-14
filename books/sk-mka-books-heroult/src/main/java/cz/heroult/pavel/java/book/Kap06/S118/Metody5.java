package cz.heroult.pavel.java.book.Kap06.S118;

public class Metody5 {
	static final double secti(final int a, final double b) {
		return a + b;
	}

	static final int secti(final int a, final int b) { // p�et�en� metoda
														// secti()
		return a + b;
	}

	public static void main(final String[] args) {
		System.out.println(secti(1, 3.14));
		System.out.println(secti(2, 5));
	}
}
