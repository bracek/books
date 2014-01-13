package cz.heroult.pavel.java.book.Kap03.S61;

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

public class Inkrement {
  public static void main(final String[] args) {
    int i = 5, j = 1, k;

    i++;             // i bude 6
    System.out.println("i = " + i);

    j = ++i;         // j bude 7, i bude 7
    System.out.println("j = " + j + ", i = " + i);

    j = i++;         // j bude 7, i bude 8
    System.out.println("j = " + j + ", i = " + i);

    k = --j + 2;     // k bude 8, j bude 6, i bude 8
    System.out.println("k = " + k + ", j = " + j);
  }
}
