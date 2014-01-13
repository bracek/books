package cz.heroult.pavel.java.book.Kap13.S249;

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

class Obdelnik extends Usecka implements InfoDalsi {
  int sirka;

  Obdelnik(int delka, int sirka) {
    super(delka);
    this.sirka = sirka;
  }

  public void kdoJsem() {
    System.out.print("Obdelnik");
  }

  public void vlastnosti() {
    System.out.println(" = " + delka + ", " + sirka);
  }

   public void vypisSirka() {  // nen� z ��dn�ho rozhran�
    System.out.println(sirka);
  }
}

public class Test {
  public static void main(final String[] args) {
    Obdelnik o = new Obdelnik(2, 4);
    Info io = new Obdelnik(3, 6);
    InfoDalsi iod = new Obdelnik(5, 7);
    o.kdoJsem(); o.vlastnosti();
    io.kdoJsem(); ((Obdelnik)io).vlastnosti();
    ((Obdelnik)iod).kdoJsem(); iod.vlastnosti();
//    InfoDalsi iud = new Usecka(6);              // chyba
    ((Obdelnik)io).vypisSirka();
  }
}
