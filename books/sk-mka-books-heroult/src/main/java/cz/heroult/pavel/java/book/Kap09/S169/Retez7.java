package cz.heroult.pavel.java.book.Kap09.S169;

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

public class Retez7 {
  public static void main(final String[] args) {
    String s2, s3, s1 = "mala a VELKA";

    s2 = s1.substring(5);
    s3 = s1.substring(5, 9);
    System.out.println(s2);  // "a VELKA"
    System.out.println(s3);  // "a VE"
  }
}
