package cz.heroult.pavel.java.book.Kap11.S218;

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

public class Klon1 {
  int i;

  Klon1(int i) { this.i = i; }

  public static void main(final String[] args) throws
                                 CloneNotSupportedException {
    Klon1 kopie, orig = new Klon1(5);
    kopie = (Klon1) orig.clone();
    System.out.println("orig: " + orig.i);
    System.out.println("kopie: " + kopie.i);
  }
}
