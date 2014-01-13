package cz.heroult.pavel.java.book.Kap05.S105;

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

public class ViceCyklu {
  public static void main(final String[] args) {
    int[] a = new int[10];
    int[] b = new int[10];
    int[] x = new int[10];

    for (int i = 0;  i < 10;  i++) {
      a[i] = i + 1;
      b[i] = i + 1;
      x[i] = i + 1;    // spr�vn� v�po�et
//      x[i] = i;        // nulov� d�litel
    }

chyba:
    {
      for (int i = 0;  i < 10;  i++) {
        for (int j = 0;  j < 10;  j++) {
          for (int k = 0;  k < 10;  k++) {
            if (x[k] == 0)
              break chyba;
            a[i] = a[i] + b[j] / x[k];
          }
        }
      }
      System.out.println("Dobre");
      // a nap�. tisk v�sledk� a return
      for (int i = 0;  i < 10;  i++) {
        System.out.print(a[i] + "  ");
      }
      System.exit(1);

     }
     System.out.println("Nulovy delitel");
  }
}
