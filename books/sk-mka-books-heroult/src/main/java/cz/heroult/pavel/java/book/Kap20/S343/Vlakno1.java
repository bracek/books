package cz.heroult.pavel.java.book.Kap20.S343;

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

public class Vlakno1 extends Thread {
  public Vlakno1(final String jmeno) {
    super(jmeno);
  }
    @Override
  public void run() {
    for (int i = 1;  i <= 3;  i++) {
      System.out.println(i + ". " + getName());
      try {
        Thread.sleep(1000);
      }
      catch(InterruptedException e) {
        System.out.println("Jsem vzhuru - " + getName());
      }
    }
  }

  public static void main(final String[] args) {
    Vlakno1 vlAhoj = new Vlakno1("ahoj");
    vlAhoj.start();
    new Vlakno1("nazdar").start();
    new Vlakno1("cao").start();
  }
}
