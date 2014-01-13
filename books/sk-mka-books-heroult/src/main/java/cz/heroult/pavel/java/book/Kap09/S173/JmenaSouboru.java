package cz.heroult.pavel.java.book.Kap09.S173;

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

public class JmenaSouboru {
  public static void main(final String[] args) {
    for (int i = 1;  i <= 567;  i++) {
      String jmeno = String.format("PIC-%04d.jpg", i);
      System.out.println(jmeno);
    }
  }
}
