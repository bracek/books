package cz.heroult.pavel.java.book.Kap15.S265;

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

class Usecka {
  int delka;
  Usecka(int delka) { this.delka = delka; }

  public Info informace() {
    return new Info() {
      public void kdoJsem() {
        System.out.println("Usecka " + delka);
      }
    };    // konec prikazu return - st�edn�k nutn�
  }       // konec metody informace()
}

public class Test {
  public static void main(final String[] args) {
    Usecka u = new Usecka(5);
//    u.kdoJsem();                 // chyba
    Info i = u.informace();
    i.kdoJsem();
  }
}
