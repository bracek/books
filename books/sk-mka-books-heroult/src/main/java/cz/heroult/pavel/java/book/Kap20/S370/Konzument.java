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

public class Konzument extends Thread {
  private Cteni c;
  private int suma = 0;

  Konzument(Cteni c) {
    this.c = c;
  }

  public void run() {
    int cislo;
    while (true) {
      cislo = c.predej();
      if (interrupted() == false)
        suma += cislo;
      else
        break;
    }

    System.out.println("  " + c.jmenoSouboru + " - vysledna suma: " + suma);
  }
}
