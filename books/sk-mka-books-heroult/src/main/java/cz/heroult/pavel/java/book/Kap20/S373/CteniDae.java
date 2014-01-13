package cz.heroult.pavel.java.book.Kap20.S373;

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

public class CteniDae {
  private FileReader fr;
  private BufferedReader in;
  public String jmenoSouboru;
  private int hodnota;
  private boolean precteno = false;
  private boolean konecSouboru = false;

  CteniDae(String jmeno) {
    jmenoSouboru = new String(jmeno);
    try {
      fr = new FileReader(jmenoSouboru);
      in = new BufferedReader(fr);
    }
    catch (IOException e) {
      System.out.println("Chyba pri otvirani souboru!");
    }
  }

  synchronized public void nacti() {
    while (precteno == true) {
      try {
        wait();
      }
      catch (InterruptedException e) { }
    }

    String radka;
    try {
      if ((radka = in.readLine()) != null) {
        hodnota = Integer.valueOf(radka).intValue();
        System.out.print(jmenoSouboru + " precteno: " + hodnota + "  ");
      }
      else {
        konecSouboru = true;
      }
    }
    catch (IOException e) {
      System.out.println("Chyba pri cteni souboru!");
    }
    precteno = true;
    notifyAll();
  }

  synchronized public int predej() {
    while (precteno == false) {
      try {
        wait();
      }
      catch (InterruptedException e) { }
    }
    precteno = false;
    if (konecSouboru == false) {
      System.out.println(jmenoSouboru + " predano: " + hodnota + "  ");
      notifyAll();
      return hodnota;
    }
    else {
      Thread.currentThread().interrupt();
      return 0;
    }
  }

  protected void finalize() {
    try {
      fr.close();
    }
    catch (IOException e) {
      System.out.println("Chyba pri zavirani souboru!");
    }
  }
}
