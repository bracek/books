package cz.heroult.pavel.java.book.Kap05.S104;

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

public class For {
  final static int N = 50000000;
  public static void main(final String[] args) {
    long z, k;    
    int i, soucin;

    z = System.currentTimeMillis();

    for (i = 1, soucin = 1;  i <= N;  i++)
      if (i % 2 == 1)  // d�len� modulo pro zji�t�n� lichosti
         soucin *= i;

    k = System.currentTimeMillis();
    System.out.print("soucin = " + soucin);
    System.out.println(", cas = " + (k - z) + " [msec]");

    z = System.currentTimeMillis();
    for (i = 3, soucin = 1;  i <= N;  i += 2)
       soucin *= i;

    k = System.currentTimeMillis();
    System.out.print("soucin = " + soucin);
    System.out.println(", cas = " + (k - z) + " [msec]");
  }
}
