package cz.heroult.pavel.java.book.Kap19.S338;

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

public class Pamet {
  public static void main(final String[] args) {
    Runtime r = Runtime.getRuntime();

    System.out.println("Cela pamet: " + r.totalMemory());
    System.out.println("Volna pamet: " + r.freeMemory());

    int[] pole = new int[100000000];
    System.out.println("Volna pamet: " + r.freeMemory());
    pole = null;
    System.gc();
    System.out.println("Volna pamet: " + r.freeMemory());
  }
}
