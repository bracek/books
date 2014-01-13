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

import java.io.*;

public class Vstup extends Thread {
  static public boolean hotovo = false;
  public void run() {
    byte[] pole = new byte[10];
    Thread.currentThread().setPriority(MAX_PRIORITY);
    while (hotovo == false) {
      try {
        System.in.read(pole);
        if (pole[0] == 'K') {
          hotovo = true;
        }
      }
      catch (IOException e) {
        System.out.println("Chyba vstupu");
        hotovo = true;
      }
    }
  }
}
