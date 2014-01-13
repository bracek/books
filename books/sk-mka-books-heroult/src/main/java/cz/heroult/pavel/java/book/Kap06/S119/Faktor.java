package cz.heroult.pavel.java.book.Kap06.S119;

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

public class Faktor {
  public static void main(final String[] args) {
    System.out.println("20! = " + fakt(20));
  }

  public static long fakt(final long n) {
    if (n > 1) 
      return n * fakt(n - 1);
    else 
      return 1;
  }
}
