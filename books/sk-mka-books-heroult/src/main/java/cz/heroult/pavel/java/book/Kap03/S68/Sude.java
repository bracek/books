package cz.heroult.pavel.java.book.Kap03.S68;

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

public class Sude {
  public static void main(final String[] args) {
    int i = 4;

    if (i % 2 == 0)              // klasicky
      System.out.println(i + " je sude");

    if ((i & 1) == 0)            // bitov�
      System.out.println(i + " je sude");
  }
}
