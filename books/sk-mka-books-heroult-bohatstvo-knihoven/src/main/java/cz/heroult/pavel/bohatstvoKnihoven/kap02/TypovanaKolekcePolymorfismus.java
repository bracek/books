package cz.heroult.pavel.bohatstvoKnihoven.kap02;

import java.util.ArrayList;

interface T {

	void tiskni();
}

class A implements T {

	public void tiskni() {
		System.out.println("A");
	}
}

class B extends A {

	public void tiskni() {
		System.out.println("B potomek A");
	}
}

class TypovanaKolekcePolymorfismus {

	static void main(final String[] args) {
		ArrayList<T> ar = new ArrayList<T>();
		ar.add(new A());
		ar.add(new B());
		// ar.add(new Integer(3)); // chyba pri prekladu
		tisk(ar);
	}

	static void tisk(final ArrayList<? extends T> ar) {
		for (int i = 0; i < ar.size(); i++) {
			ar.get(i).tiskni();
		}
	}
}
