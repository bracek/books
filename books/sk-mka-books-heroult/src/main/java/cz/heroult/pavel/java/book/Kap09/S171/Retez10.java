package cz.heroult.pavel.java.book.Kap09.S171;

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

public class Retez10 {
  public static void main(final String[] args) {
    String s2, s1 = "\r\n\t ahoj\t \r\n";

    s2 = s1.trim();
    System.out.println("Zacatek:" + s1 + ":konec");
    System.out.println("Zacatek:" + s2 + ":konec");
  }
}
