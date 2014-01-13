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

public class Retez6 {
  public static void main(final String[] args) {
    String s2, s1 = "cacao";

    s2 = s1.replace('c', 'k');
    System.out.println(s1);  // "cacao"
    System.out.println(s2);  // "kakao"
  }
}
