package cz.heroult.pavel.java.book.Kap03.S51;

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

public class PojmenovaneKonstanty {
  final static int ASISTENT         = 1;
  final static int ODBORNY_ASISTENT = 2;
  final static int DOCENT           = 3;
  final static int PROFESOR         = 4;
  
  public static void main(final String[] args) {
    int vyucujici = DOCENT;

    if (vyucujici == DOCENT  ||  vyucujici == PROFESOR) {
      System.out.println("Muze vest doktorandy");
    }
    
    System.out.println("vyucujici: " + vyucujici);
    
    vyucujici *= 2;    // nesmysl, ale mozny
    System.out.println("vyucujici: " + vyucujici);
  }
}
