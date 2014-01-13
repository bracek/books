package cz.heroult.pavel.java.book.Kap10.S202;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                  U�ebnice jazyka Java                       //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       CTI_ME.TXT                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2000                      // 
//                                                             //
/////////////////////////////////////////////////////////////////
class PraceSPolem {

	public void nastavPole(final int[] p, final int h) {
		for (int i = 0; i < p.length; i++) {
			p[i] = h + i;
		}
		// h++; // chyba
		// p = null; // chyba
	}

	public static void tiskniPole(final int[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.print("[" + i + "] = " + p[i] + ", ");
		}
		System.out.print("\b\b \n");
	}

	public void nastavPrvek(int prvek, final int h) {
		prvek = h;
	}
}

public class PoleOdkazem {

	public static void main(final String[] args) {
		PraceSPolem obj = new PraceSPolem();
		int[] pole = { 5, 4, 3, 2, 1 };
		PraceSPolem.tiskniPole(pole);
		obj.nastavPole(pole, 3);
		PraceSPolem.tiskniPole(pole);
		obj.nastavPrvek(pole[0], 5);
		PraceSPolem.tiskniPole(pole);
	}
}
