package cz.heroult.pavel.java.book.Kap03.S62;

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

public class Preteceni {
  public static void main(final String[] args) {
    byte b = 126;
    System.out.println("b = " + b);
    b += 3;
    System.out.println("b = " + b);
    b = -126;
    b += -5;
    System.out.println("b = " + b);
  }
}
