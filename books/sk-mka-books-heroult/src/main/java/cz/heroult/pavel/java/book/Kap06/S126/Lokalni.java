package cz.heroult.pavel.java.book.Kap06.S126;

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

public class Lokalni {
   static void tiskni() {
     int i = 6;
     System.out.println(i);
     {
  //     int i = 7;         // chyba - dvojn�sobn� deklarace
  //     long i = 7;        // chyba - dvojn�sobn� deklarace
       int j = 8;
       System.out.println(j);
     }
  //     System.out.println(j); // chyba - j nen� viditeln�
    }


  static void tiskni2() {
    int i = 6;
    System.out.println(i);
 //   for (int i = 1;  i < 5;  i++)  // chyba
      System.out.println(i);
  }


  public static void main(final String[] args) {
    tiskni();
    tiskni2();
  }
}
