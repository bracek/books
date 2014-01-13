package cz.heroult.pavel.java.book.Kap05.S105;

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

public class ForContinue {
  public static void main(final String[] args) {
navesti: 
    for (int n = 0;  n < 4;  n++) {
      for (int m = 0;  m < 2;  m++) {
        if (n == 2  &&  m == 0) 
          continue navesti;
        System.out.print(n + "-" + m + " ");
      }
    }
  }
}
