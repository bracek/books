package cz.heroult.pavel.java.book.Kap11.S216;

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

class Rodic {
  public int i;
  static public long j;
}

public class Potomek extends Rodic {
  public long i;
  static public int j;
  public Potomek(final long noveI) {
    i = noveI;
    super.i = 5;
  }
  public static void main(final String[] args) {
    Rodic.j = 6;
    Potomek.j = 7;
  }
}
