package cz.heroult.pavel.java.book.Kap12.S236;

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

class APriv {
  private int i;
  private int getI() { return i; }
}

class BPriv {
  int j;
  BPriv() {
    APriv a = new APriv();
//    a.i = 1;        // chyba
//    j = a.getI();   // chyba
  }
}

class ABPriv extends APriv {
  int j;
  ABPriv() {
//    i = 1;        // chyba
//    j = getI();   // chyba
  }
}
