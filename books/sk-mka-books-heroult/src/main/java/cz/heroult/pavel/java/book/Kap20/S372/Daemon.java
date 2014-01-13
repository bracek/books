package cz.heroult.pavel.java.book.Kap20.S372;

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

public class Daemon extends Thread {
  public void run() {
    for (int i = 1;  i <= 10;  i++) {
      System.out.println(i + ". daemon je tu");
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
      }
    }
  }

  public static void main(final String[] args) {
    System.out.println("Zacatek programu");
    Daemon vlD = new Daemon();
//    vlD.setDaemon(true);
    vlD.start();
    if (vlD.isDaemon() == true)
      System.out.println("Program hned skonci");
    else
      System.out.println("Program pobezi dlouho");

    System.out.println("Konec programu");
  }
}
