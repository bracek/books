package cz.heroult.pavel.java.book.Kap11.S212;

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
  public Rodic() { i = 1; }
  final int getI() { return i; }
}

public class Potomek extends Rodic {
  //  int getI() { return i * 2; }  // chyba

  public static void main(final String[] args) {
    Potomek pot = new Potomek();
    System.out.println("Hodnota je: " + pot.getI());
  }
}
