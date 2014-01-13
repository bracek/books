package cz.heroult.pavel.java.book.Kap06.S115;

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

public class Metody1 {
  static int max(final  int a,
final  int b) {
    if (a > b)
      return (a);
    else
      return (b);
  }

  public static void main(final String[] args) {
    int i = 1, j = 2;
    System.out.println(max(i, j));
    System.out.println(max(i + 3, j));
    System.out.println(max(i, 5));
    System.out.println(max(10 * i, j - 15));
  }
}
