package cz.heroult.pavel.java.book.Kap20.S361;

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

public class Vlakno11 extends Thread {
  public void run() {
    while (ReadVl.hotovo == false) {
      System.out.print(ReadVl.suma + "\r");
      try {
        Thread.sleep(100);  // 100 milisekund
      }
      catch (InterruptedException e) {
        System.out.println("Predcasne vzbuzen");
        break;
      }
    }
    System.out.println(ReadVl.suma);
  }

  public static void main(final String[] argv) throws InterruptedException {
    long zac = System.currentTimeMillis();
    ReadVl vlCteni = new ReadVl("data.txt");
    vlCteni.start();
    Vlakno11 vlVypis = new Vlakno11();
    vlVypis.start();
    vlVypis.join(1000);
    if (vlVypis.isAlive() == true) {
      System.out.println("\t Vyprsel ti cas - koncis!");
      vlVypis.interrupt();
    }

    long kon = System.currentTimeMillis();
    System.out.println("Konec: " + (kon - zac));
  }
}
