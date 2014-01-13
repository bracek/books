package cz.heroult.pavel.java.book.Kap20.S353;

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

public class VypisoveVlakno extends Thread {
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

  public static void main(final String[] argv) throws InterruptedException {
    ReadVl vlCteni = new ReadVl("data.txt");

// p�i pokusech postupn� odkomentov�vat
//    vlCteni.setPriority(MIN_PRIORITY);
//    vlCteni.setPriority(MAX_PRIORITY);
    vlCteni.start();
    VypisoveVlakno vlVypis = new VypisoveVlakno();
    vlVypis.start();
  }
}
