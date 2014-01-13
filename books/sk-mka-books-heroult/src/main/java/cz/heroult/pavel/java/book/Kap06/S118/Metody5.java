package cz.heroult.pavel.java.book.Kap06.S118;

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

public class Metody5 {
	static double secti(int a, double b) {
		return a + b;
	}

	static int secti(int a, int b) { // p�et�en� metoda secti()
		return a + b;
	}

	public static void main(final String[] args) {
		System.out.println(secti(1, 3.14));
		System.out.println(secti(2, 5));
	}
}