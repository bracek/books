package cz.heroult.pavel.java.book.Kap03.S59;

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

public class ZtrataPresnosti {
  public static void main(final String[] args) {
    int j, i = 1234567890;
    float f;
    double promile;

    f = i;
    j = (int) f;
    promile = ((double) (j - i) / (double) i) * 1000.0;
    System.out.println("i = " + i + "\nj = " + j);
    System.out.println("promile = " + promile);
  }
}
