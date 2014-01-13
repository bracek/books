package cz.heroult.pavel.java.book.Kap03.S67;

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

public class UplnyLogickySoucet {
  public static void main(final String[] args) {
    int i, j, k;

    i = 1; j = 2; k = 3;
    if (i == 1  |  ++j == 2)
      k = 4;
    System.out.println("i = "+ i +", j = "+ j +", k = "+ k);
  }
}
