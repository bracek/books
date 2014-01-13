package cz.heroult.pavel.java.book.Kap06.S121;

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

public class Hodnotou {
	static int zmena(int i) {
		i++;
		return i;
	}

	public static void main(final String[] args) {
		int j, k = 4;
		j = zmena(k);
		System.out.println("k = " + k + ", j = " + j);
	}
}
