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

public class Retez15 {
  public static void main(final String[] args) {
    String s;
    int i;

    System.out.println(Math.PI);   // 3.141592656589793
    s = String.valueOf(Math.PI);
    i = s.indexOf('.');
    s = s.substring(0, i + 6);
    System.out.println(s);         // 3.14159
  }
}
