package cz.heroult.pavel.java.book.Kap11.S208;

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

class Obdelnik {
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
    return Math.sqrt(pom);
  }

  public int hodnotaSirky() {
    return sirka;
  }
}

public class Kvadr extends Obdelnik {
  public int hloubka;

  public Kvadr(final int sirka,
final  int vyska,
final  int hloubka) {
    super(sirka, vyska);
    this.hloubka = hloubka;
  }

  public double delkaUhlopricky() {
    double pom = super.delkaUhlopricky();
    pom = (pom * pom) + (hloubka * hloubka);
    return Math.sqrt(pom);
  }

  public static void main(final String[] args) {
    Kvadr kva = new Kvadr(6, 8, 10);
    System.out.println("Uhlopricka: "+ kva.delkaUhlopricky());
    System.out.println("Sirka je: " + kva.hodnotaSirky());
    System.out.println("Vyska je: " + kva.vyska);
  } 
}
