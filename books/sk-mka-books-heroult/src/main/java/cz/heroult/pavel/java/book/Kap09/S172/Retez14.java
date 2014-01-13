package cz.heroult.pavel.java.book.Kap09.S172;

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

public class Retez14 {
  public static void main(final String[] args) {
    boolean b = true;
    int i = 1234567; 
    double d = Math.PI;
    String s;

    s = String.valueOf(b);
    System.out.println("b: " + s);
    s = String.valueOf(i);
    System.out.println("i: " + s);
    s = String.valueOf(d);
    System.out.println("d: " + s);
  }
}
