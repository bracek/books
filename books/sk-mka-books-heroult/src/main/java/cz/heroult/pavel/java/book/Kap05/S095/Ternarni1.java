package cz.heroult.pavel.java.book.Kap05.S095;

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

public class Ternarni1 {
  public static void main(final String[] args) {
    int i, k, j = 2;

    i = (j == 2) ? 1 : 3;   // i bude 1
    System.out.println("i = " + i);

    k = (i > j) ? i : j;    // k bude maximum z i a j, tedy 2
    System.out.println("k = " + k);
  }
}
