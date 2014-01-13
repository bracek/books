package cz.heroult.pavel.java.book.Kap03.S63;

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

public class Prirazeni {
  public static void main(final String[] args) {
    int i = 4, j = 3;

    j += i;         //    j bude 7
    System.out.println("j = " + j);

    j /= --i;       //    j bude 2, i bude 3
    System.out.println("j = " + j + ", i = " + i);

    j *= i - 2;     //    j = j * (i - 2) = 2
    System.out.println("j = " + j + ", i = " + i);
  }
}
