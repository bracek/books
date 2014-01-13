package cz.heroult.pavel.java.book.Kap13.S246;

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

  public int getDelka() { return delka; }
}

public class Test {
  public static void main(final String[] args) {
    Info info = new Usecka(2);
    info.kdoJsem();
    // info.vlastnosti();                     // chyba
    // System.out.println(info.getDelka());   // chyba
  }
}
