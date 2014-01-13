package cz.heroult.pavel.java.book.Kap03.S53;

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

public class ViceEnum {
  enum Karty {CERVENA, ZELENA, KULE, ZALUDY};
  enum Barvy {MODRA, ZLUTA, CERVENA, ZELENA};
                 
  public static void main(final String[] args) {
    Karty k = Karty.CERVENA;
//    Barvy b = Karty.CERVENA;     // nelze
    Barvy b = Barvy.CERVENA;

    System.out.println("karta: " + k);
    System.out.println("barva: " + b);
  }
}
