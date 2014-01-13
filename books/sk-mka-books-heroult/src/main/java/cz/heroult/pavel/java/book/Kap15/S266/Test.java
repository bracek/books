package cz.heroult.pavel.java.book.Kap15.S266;

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

  public Info i = new Info() {
    public void kdoJsem() {
      System.out.println("Usecka " + delka);
    }
  };    // konec deklarace promenne i
}

public class Test {
  public static void main(final String[] args) {
    Usecka u = new Usecka(5);
    u.i.kdoJsem();

    if (u instanceof Info)
      System.out.println("u implementuje Info");
    if (u.i instanceof Info)
      System.out.println("u.i implementuje Info");
    if (u.i instanceof Info)
      System.out.println(u.i.getClass().getName() +
                         " implementuje Info");
  }
}
