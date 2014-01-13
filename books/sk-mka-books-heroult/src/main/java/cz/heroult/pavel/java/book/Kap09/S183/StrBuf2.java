package cz.heroult.pavel.java.book.Kap09.S183;

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

public class StrBuf2 {
  public static void main(final String[] args) {
    StringBuffer b;

    b = new StringBuffer("Ahoj");
    System.out.println(b);    // Ahoj
    b.reverse();
    System.out.println(b);    // johA
  }
}
