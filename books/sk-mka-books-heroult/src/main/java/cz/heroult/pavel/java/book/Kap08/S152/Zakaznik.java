package cz.heroult.pavel.java.book.Kap08.S152;

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
  static public int pocetZakazniku = 0;  // promenna tridy
  public int utratil;                    // promenna instance

  public Zakaznik() {
    Zakaznik.pocetZakazniku++;
    this.utratil = 0;
  }

  public void platil(final int cena) {
    this.utratil += cena;
  }

  public static void main(final String[] args) {
    System.out.println("Pocet zakazniku: " + pocetZakazniku);
    Zakaznik zak = new Zakaznik();
    System.out.println("Pocet zakazniku: " + pocetZakazniku);
    zak.platil(15);
    Zakaznik zak2 = new Zakaznik();
    System.out.println("Pocet zakazniku: " + pocetZakazniku);
    zak.platil(30);
    zak2.platil(20);
    System.out.println("Utratili: " + zak.utratil + " + " + zak2.utratil);

    pocetZakazniku++; // nesmysl, ale p�eklada�i nevad�
  }
}
