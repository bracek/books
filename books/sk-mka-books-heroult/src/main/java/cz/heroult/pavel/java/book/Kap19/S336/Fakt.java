package cz.heroult.pavel.java.book.Kap19.S336;

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

public class Fakt {
	public static long faktRek(final long n) {
		if (n > 1) {
			return n * faktRek(n - 1);
		} else {
			return 1;
		}
	}

	public static long faktCykl(final long n) {
		long f = 1;
		for (; n > 1; n--)
			f *= n;
		return f;
	}
}
