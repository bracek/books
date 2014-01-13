package cz.heroult.pavel.java.book.Kap07.S137;

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

public class Pole7 {
  public static void main(final String[] args) {
    final int RADKY   = 24;
    final int SLOUPCE = 80;

    byte[] obrazovka = new byte[RADKY * SLOUPCE];

    for (int i = 0;  i < RADKY;  i++) {
      for (int j = 0;  j < SLOUPCE;  j++) {
        obrazovka[i * SLOUPCE + j] = (byte) (i + j);
      }
    }
      
    System.out.println(obrazovka[18 * SLOUPCE + 23]);
  }
}
