package cz.heroult.pavel.java.book.Kap06.S122;

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

public class Pretizeni1 {
  static int ctverec(int i) {
    return i * i;
  }

  static double ctverec(double i) {
    return i * i;
  }

  //  static long ctverec(int i) { // chyba
  static long ctverec(long i) {
    return i * i;
  }

  public static void main(final String[] args) {
    int j = ctverec(5);
    double d = ctverec(5.5);
    long l = ctverec(12345L);

    System.out.println("j = " + j + ", d = " + d + ", l = " + l);
  }
}
