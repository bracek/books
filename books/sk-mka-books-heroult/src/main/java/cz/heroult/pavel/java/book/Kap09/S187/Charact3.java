package cz.heroult.pavel.java.book.Kap09.S187;

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

public class Charact3 {
  public static void main(final String[] args) {
    int i, j;
    i = Character.digit('5', 10);
    j = Character.digit('F', 16);
    System.out.println("i = " + i + " j = " + j);   // i = 5 j = 15
    i = Character.digit('\u0BE7', 10);              // tamilsk� jedni�ka
    System.out.println("i = " + i);                 // i = 1
  }
}
