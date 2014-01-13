package cz.heroult.pavel.java.book.Kap03.S52;

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

public class PouzitiEnum {
  enum Vyucujici {ASISTENT, ODBORNY_ASISTENT,
                  DOCENT, PROFESOR};
                 
  public static void main(final String[] args) {
    Vyucujici vyucujici = Vyucujici.DOCENT;

    if (vyucujici == Vyucujici.DOCENT  
       ||  vyucujici == Vyucujici.PROFESOR) {
      System.out.println("Muze vest doktorandy");
    }
    
    System.out.println("vyucujici: " + vyucujici);

/* nelze prelozit    
    vyucujici *= 2;
    System.out.println("vyucujici: " + vyucujici);
*/    
  }
}
