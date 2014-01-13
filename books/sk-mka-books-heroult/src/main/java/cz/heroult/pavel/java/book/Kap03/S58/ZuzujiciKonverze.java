package cz.heroult.pavel.java.book.Kap03.S58;

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

public class ZuzujiciKonverze {
  public static void main(final String[] args) {
    short s = 300;
    byte b;
    b = (byte) s;
    System.out.println("s = " + s + ", b = " + b);
    b = (byte) 255;
    System.out.println("b = " + b);
  }
}
