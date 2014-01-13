package cz.heroult.pavel.java.book.Kap20.S358;

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

public class Vlakno3 extends Thread {
  public void run() {
    while (ReadVl.hotovo == false) {
      System.out.print(ReadVl.suma + "\r");
      try {
        Thread.sleep(100);  // 100 milisekund
      }
      catch (InterruptedException e) {
      }
    }
    System.out.println(ReadVl.suma);
  }

  public static void main(final String[] args) throws InterruptedException {
    System.out.println(Thread.currentThread());
    long zac = System.currentTimeMillis();
    ReadVl vlCteni = new ReadVl("data.txt");
    vlCteni.start();
    Vlakno3 vlVypis = new Vlakno3();
    vlVypis.start();
    vlVypis.join();
    long kon = System.currentTimeMillis();
    System.out.println("Konec: " + (kon - zac));
  }
}
