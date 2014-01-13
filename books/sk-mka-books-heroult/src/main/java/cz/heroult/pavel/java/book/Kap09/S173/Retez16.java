package cz.heroult.pavel.java.book.Kap09.S173;

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

public class Retez16 {
  public static void main(final String[] args) {
  int i = 254;

  System.out.println(Integer.toBinaryString(i));  // 11111110
  System.out.println(Integer.toOctalString(i));   // 376 
  System.out.println(Integer.toHexString(i));     // fe
  }
}
