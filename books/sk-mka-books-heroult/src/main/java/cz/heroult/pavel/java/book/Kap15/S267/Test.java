package cz.heroult.pavel.java.book.Kap15.S267;

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

class Jmeno {
  public void kdoJeTo(final Object o) {
    System.out.print(o.getClass().getName());
  }
}

class Usecka {
  protected int delka;

  Usecka(int delka) { this.delka = delka; }
}

class Obdelnik extends Usecka implements Info {
  private int sirka;

  Obdelnik(int delka, int sirka) {
    super(delka);
    this.sirka = sirka;
  }
  
  public void kdoJsem() {
    new VnitrniJmeno().kdoJsem();
  }

  class VnitrniJmeno extends Jmeno {
    void kdoJsem() {
      kdoJeTo(Obdelnik.this);
//      kdoJeTo(this);
      System.out.println(" " + delka + "x" + sirka);
    }
  }
}

public class Test {
  public static void main(final String[] args) {
    Info i = new Obdelnik(3, 6);
    i.kdoJsem();
  }
}
