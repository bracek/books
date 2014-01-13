package cz.heroult.pavel.java.book.Kap06.S124;

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

public class Metody {
  static void tiskni1() {
    System.out.println(i);
  }

  public static void main(final String[] args) {
    tiskni1();
    tiskni2();
  }

  static int i = 5;

  static void tiskni2() {
    System.out.println(i);
  }
}
