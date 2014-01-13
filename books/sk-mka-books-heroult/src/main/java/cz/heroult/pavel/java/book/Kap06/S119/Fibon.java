package cz.heroult.pavel.java.book.Kap06.S119;

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

public class Fibon {
  public static void main(final String[] args) {
    final int MAX = 42;
    long begin, end, f;

    for (long n = 0;  n <= MAX;  n += 5) {
      begin = System.currentTimeMillis();

      f = fib(n);

      end = System.currentTimeMillis();
      System.out.println("fib(" + n + ") = " + f +
                       " v case: " + (end - begin) + " [msec]");
    }
  }

  public static long fib(final long n) {
    if (n == 0  ||  n == 1) {
      return n;
    }
    else {
      return fib(n - 1) + fib(n - 2);
    }
  }
}
