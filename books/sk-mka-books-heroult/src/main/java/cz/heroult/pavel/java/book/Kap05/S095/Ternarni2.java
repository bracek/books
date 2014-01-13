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

public class Ternarni2 {
  public static void main(final String[] args) {
    for (int i = 1;  i <= 100;  i++) {
      System.out.print(i);
      if (i % 10 == 0) {
        System.out.print("\n");
      }
      else
        System.out.print(" ");
    }

    System.out.println("---------------------");

    for (int i = 1;  i <= 100;  i++)
      System.out.print(i + ((i % 10 == 0) ? "\n" : " "));

  }
}
