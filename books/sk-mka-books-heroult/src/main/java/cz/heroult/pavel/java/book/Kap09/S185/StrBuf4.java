package cz.heroult.pavel.java.book.Kap09.S185;

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

public class StrBuf4 {
  public static void main(final String[] args) {
    StringBuffer b;

    b = new StringBuffer("Ahoj");

    String s1, s2, s3;

    s1 = b.toString();
    s2 = b.substring(1);
    s3 = b.substring(1, 3);
    System.out.println(s1);  // Ahoj
    System.out.println(s2);  // hoj
    System.out.println(s3);  // ho
  }
}
