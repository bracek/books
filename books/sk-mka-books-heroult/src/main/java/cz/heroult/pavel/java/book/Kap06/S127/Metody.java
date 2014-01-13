package cz.heroult.pavel.java.book.Kap06.S127;

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
  static int i = 5;

  static void tiskni() {
    int i = 6;
    System.out.println(i);          // tiskne 6  
    System.out.println(Metody.i);   // tiskne 5
  }

  public static void main(final String[] args) {
    tiskni();
  }
}
