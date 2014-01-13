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

public class Retez5 {
  public static void main(final String[] args) {
    String s1 = "mala a";
    String s2 = " VELKA";
    String s3, s4;

    s3 = s1 + s2;
    s4 = s1.concat(s2);
    System.out.println(s1);  // "mala a"
    System.out.println(s2);  // " VELKA"
    System.out.println(s3);  // "mala a VELKA"
    System.out.println(s4);  // "mala a VELKA"
  }
}
