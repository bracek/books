package cz.heroult.pavel.java.book.Kap08.S157;

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

public class Zakaznik {
  static int pocetZakazniku = 0;  // promenna tridy
  public int utratil;             // promenna instance

  public Zakaznik() {
    Zakaznik.pocetZakazniku++;
    this.utratil = 0;
  }

  public void platil(final int cena) {
    this.utratil += cena;
    pocetZakazniku++;
    int i = kolikZakazniku();
  }

  public static int kolikZakazniku() {
//    int i = utratil;    // chyba
//    platil(10);         // chyba
    return pocetZakazniku;
  }

  public static void main(final String[] args) {
    System.out.println("Pocet zakazniku: " + kolikZakazniku());
    Zakaznik zak1 = new Zakaznik();
    System.out.println("Pocet zakazniku: " + Zakaznik.kolikZakazniku());
  }
}
