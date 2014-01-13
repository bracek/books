package cz.heroult.pavel.java.book.Kap06.S120;

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

public class Konverze {
  static int konv1(final double d) {    
    return (int) d;                
  }                               

  static double konv2(final int d) {
    return d;
  }
  public static void main(final String[] args) {
    int k = konv1(4);
    double j = konv2( (int) 4.5);
    System.out.println("k = " + k + ", j = " + j);
  }
}
