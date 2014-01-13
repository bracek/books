package cz.heroult.pavel.java.book.Kap08.S162;

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

class Zakaznik {
  static int pocetZakazniku = 0;  // promenna tridy
  public int utratil;             // promenna instance

  public Zakaznik() {
    pocetZakazniku++;
    utratil = 0;
  }

  public void platil(final int cena) {
    this.utratil += cena;
  }

  public static int kolikZakazniku() {
    return pocetZakazniku;
  }

  protected void finalize() throws Throwable {
    pocetZakazniku--;
    System.out.println("Konec zakaznika");
    super.finalize();
  }
}

public class Hlavni {
  public static void main(final String[] args) {
    System.out.println("Pocet: " + Zakaznik.kolikZakazniku());
    Zakaznik zak1 = new Zakaznik();
    System.out.println("Pocet: " + Zakaznik.kolikZakazniku());
    Zakaznik zak2 = new Zakaznik();
    System.out.println("Pocet: " + Zakaznik.kolikZakazniku());
    zak1 = null;
    System.gc();
    System.runFinalization();
    System.out.println("Pocet: " + Zakaznik.kolikZakazniku());
  }
}
