package cz.heroult.pavel.java.book.Kap09.S174;

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

public class Retez17 {
  public static void main(final String[] args) {
    double d1 = Double.valueOf("3.14").doubleValue();
    double d2 = new Double("3.14").doubleValue();
    boolean b = Boolean.valueOf("true").booleanValue();
    int i = Integer.valueOf("123").intValue();

    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);
    System.out.println("b  = " + b);
    System.out.println("i  = " + i);
  }
}
