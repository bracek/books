package cz.heroult.pavel.java.book.Kap08.S146;

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

public class Obdelnik {
  public int sirka;
  public int vyska;

  public Obdelnik(final int parSirka,
final  int parVyska) {
    sirka = parSirka;
    vyska = parVyska;
  }

  public int obvod() {
    int sirka;
    sirka = 2 * (this.sirka + vyska);
    return sirka;
  }

  public int obsah() {
    return (sirka * vyska);
  }

  public static void main(final String[] args) {
    Obdelnik obd = new Obdelnik(1, 2);
    obd.vyska = 5;
    obd.sirka = 3;
    System.out.println("Obvod je: " + obd.obvod());

    Obdelnik obd2 = new Obdelnik(5, 3);
    System.out.println("Obdelnik vysky " + obd2.vyska + 
                       " a sirky " + obd2.sirka + 
                       " ma obvod: " + obd2.obvod());
  }
}
