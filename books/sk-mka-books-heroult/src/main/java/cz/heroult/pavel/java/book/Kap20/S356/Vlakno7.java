package cz.heroult.pavel.java.book.Kap20.S356;

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

public class Vlakno7 extends Thread {
  public void run() {
    long i = 0;
    while (Vstup.hotovo == false) {
      System.out.print(i++ + "\r");
    }
  }

  public static void main(final String[] args) {
    Vstup vlVstup = new Vstup();
    vlVstup.start();
    Vlakno7 vlVypis = new Vlakno7();
    vlVypis.start();
  }
}
