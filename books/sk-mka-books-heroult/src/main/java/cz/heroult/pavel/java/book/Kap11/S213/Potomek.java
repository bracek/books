package cz.heroult.pavel.java.book.Kap11.S213;

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

abstract class Rodic {
  public int i;
  public Rodic() { i = 1; }
  abstract int getI();
  final void setI(int noveI) { i = noveI; }
}

public class Potomek extends Rodic {
  int getI() { return i * 2; }
  void setI() { i = 5; }   // p�et�en�

  public static void main(final String[] args) {
//    Rodic rod = new Rodic();    // chyba
    Potomek pot = new Potomek();
    pot.setI(3);
    System.out.println("Hodnota je: " + pot.getI());
    pot.setI();   // p�et�en�
    System.out.println("Hodnota je: " + pot.getI());
  }
}
