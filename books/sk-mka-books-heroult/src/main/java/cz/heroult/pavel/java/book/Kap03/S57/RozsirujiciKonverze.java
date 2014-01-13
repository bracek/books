package cz.heroult.pavel.java.book.Kap03.S57;

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

public class RozsirujiciKonverze {
  public static void main(final String[] args) {
    short s = 10;
    byte b;
    int i;
    float f;
    i = s;
    f = s;
    // b = s;  // zu�uj�c� konverze
    // chyba-possible loss of precision: short, required: byte
    b = (byte) s;
    System.out.println("s = " + s + ", b = " + b);
  }
}
