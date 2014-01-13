package cz.heroult.pavel.java.book.Kap03.S37;

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
  public void character() {
    System.out.println("znak");
  }
}
    
public class OverrideUkazka extends Rodic {
//  @Override
  public void characters() {
    System.out.println("jiny znak");
  }
  public static void main(final String[] args) {
    new OverrideUkazka().character();
  }
}
