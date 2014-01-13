package cz.heroult.pavel.java.book.Kap09.S186;

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

public class Charact1 {
  public static void main(final String[] args) {
    System.out.println(Character.isDigit('1'));         // true
    System.out.println(Character.isDigit('\u0BE7'));    // true
    System.out.println(Character.isLetter('A'));        // true
    System.out.println(Character.isLetterOrDigit('?')); // false 
    System.out.println(Character.isLowerCase('b'));     // true
    System.out.println(Character.isUpperCase('B'));     // true
    System.out.println(Character.isWhitespace('\n'));   // true
  }
}
