package cz.heroult.pavel.java.book.Kap08.S143;

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

  public int obvod() {
    int pom;
    pom = 2 * (sirka + vyska);
    return pom;
  }

  public int obsah() {
    return (sirka * vyska);
  }

  public static void main(final String[] args) {
    Obdelnik obd = new Obdelnik();
    obd.vyska = 5;
    obd.sirka = 3;

    System.out.println("Obvod je: " + obd.obvod());
  }
}
