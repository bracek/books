package cz.heroult.pavel.java.book.Kap19.S340;

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

public class Exit {
  public static void konec() {
    System.out.println("Pred exit()");
    System.exit(-1);
    System.out.println("PO exit()");
  }

  public static void main(final String[] args) {
    System.out.println("Pred konec()");
    konec();
    System.out.println("PO konec()");
  }
}
