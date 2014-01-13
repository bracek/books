package cz.heroult.pavel.java.book.Kap20.S370;

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

public class Producent extends Thread {
  private Cteni c;

  Producent(Cteni c) {
    this.c = c;
  }

  public void run() {
    while (interrupted() == false) {
      c.nacti();
    }
    System.out.print("  " + c.jmenoSouboru + " - konec cteni  ");
  }
}
