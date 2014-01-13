package cz.heroult.pavel.java.book.Kap20.S349;

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

public class ReadVl extends Thread {
  FileReader fr;
  BufferedReader in;
  String jmenoSouboru;
  static public long suma = 0;
  static public boolean hotovo = false;

  ReadVl(String jmeno) {
    super("Vlakno pro cteni");
    jmenoSouboru = new String(jmeno);
  }

  public void run() {
    String radka;

    try {
      fr = new FileReader(jmenoSouboru);
      in = new BufferedReader(fr);
      while((radka = in.readLine()) != null) {
        suma += Integer.parseInt(radka);
        Thread.yield();
      }
      fr.close();
      hotovo = true;
    }
    catch (IOException e) {
      System.out.println("Chyba v souboru!");
      hotovo = true;
     }
  }
}
