package cz.heroult.pavel.java.book.Kap03.S39;

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

public class SuppressWarningUkazka {
//  @SuppressWarnings("fallthrough serial")
  public static void main(final String[] args) {
    switch (1) {
      case 1:
        System.out.println("1");
        //  zde nema byt  break; 
      case 2:
        System.out.println("2");
    }
  }
}
