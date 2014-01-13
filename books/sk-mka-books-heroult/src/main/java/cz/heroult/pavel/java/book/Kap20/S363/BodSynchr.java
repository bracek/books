package cz.heroult.pavel.java.book.Kap20.S363;

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

public class BodSynchr {
  private int[] xy = {0, 0};

  synchronized public void nastav(final int x,
final  int y) {
    xy[0] = x;
    xy[1] = y;
  }

  synchronized public int[] cti() {
    return new int[] {xy[0], xy[1]};
  }
}
