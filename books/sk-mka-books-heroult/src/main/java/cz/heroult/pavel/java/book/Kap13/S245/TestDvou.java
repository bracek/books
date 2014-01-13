package cz.heroult.pavel.java.book.Kap13.S245;

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

class Usecka implements Info, InfoDalsi {
  int delka;
  Usecka(int delka) { this.delka = delka; }
  public void kdoJsem() {
    System.out.print("Usecka");
  }
  public void vlastnosti() {
    System.out.println(" = " + delka);
  }
}

public class TestDvou {
  public static void main(final String[] args) {
    Usecka u = new Usecka(5);
    u.kdoJsem(); 
    u.vlastnosti();
  }
}
