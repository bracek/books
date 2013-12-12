package cz.heroult.pavel.java.book.Kap11.S211;

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
  public Rodic(int parI) { i = parI; }
//  public Rodic() { i = 5; }
}

public class Potomek extends Rodic {
  public Potomek() {
    super(8);
  }
  public static void main(String[] args) {
    Potomek pot = new Potomek();
  }
}
