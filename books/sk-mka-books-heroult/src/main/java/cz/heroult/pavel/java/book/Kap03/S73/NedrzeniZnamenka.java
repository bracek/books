package cz.heroult.pavel.java.book.Kap03.S73;

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

public class NedrzeniZnamenka {
  public static void main(final String[] args) {
    int x = 16;
    x >>>= 2;
    System.out.println("x = " + x);

    x = -16;
    System.out.println("x = " + Integer.toBinaryString(x));
    x >>>= 2;
    System.out.println("x = " + Integer.toBinaryString(x));
  }
}
