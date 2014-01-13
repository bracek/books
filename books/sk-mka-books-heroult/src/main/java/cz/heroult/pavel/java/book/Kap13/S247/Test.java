package cz.heroult.pavel.java.book.Kap13.S247;

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

class Usecka implements Info {
  int delka;

  Usecka(int delka) { this.delka = delka; }

  public void kdoJsem() {
    System.out.println("Usecka");
  }
}

class Obdelnik extends Usecka {
  int sirka;

  Obdelnik(int delka, int sirka) {
    super(delka);
    this.sirka = sirka;
  }
}

public class Test {
  public static void main(final String[] args) {
    Usecka u = new Usecka(5);
    Obdelnik o = new Obdelnik(2, 4);
    Info iu = new Usecka(6);
    Info io = new Obdelnik(3, 6);
    u.kdoJsem();
    o.kdoJsem();
    iu.kdoJsem();
    io.kdoJsem();
  } 
}   
