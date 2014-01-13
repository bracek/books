package cz.heroult.pavel.java.book.Kap09.S172;

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

public class Retez13 {
  public static void main(final String[] args) {
    String s1 = "mala a VELKA";
    int i;

    i = s1.lastIndexOf("VEL");
    System.out.println("Posledni VEL je na "+ i +". pozici");
  }
}
