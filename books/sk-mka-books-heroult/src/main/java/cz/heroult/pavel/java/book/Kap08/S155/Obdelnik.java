package cz.heroult.pavel.java.book.Kap08.S155;

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

  public Obdelnik(final int sirka,
final  int vyska) {
    this.sirka = sirka;
    this.vyska = vyska;
  }

  public double delkaUhlopricky() {
    double pom;
    pom = (sirka * sirka) + (vyska * vyska);
    pom = Math.sqrt(pom);
    return pom;
  }

  public static void main(final String[] args) {
    Obdelnik obd = new Obdelnik(6, 8);
    System.out.println("Uhlopricka je: " + obd.delkaUhlopricky());
  }
}
