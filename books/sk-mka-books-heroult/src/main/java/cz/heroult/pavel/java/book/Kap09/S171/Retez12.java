package cz.heroult.pavel.java.book.Kap09.S171;

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

public class Retez12 {
  public static void main(final String[] args) {
    String s = "mala a VELKA";
    int i;

    i = s.indexOf('a');
    System.out.println("Prvni a je na " + i + ". pozici");
    i = s.indexOf('a', i + 1);
    System.out.println("Dalsi a je na " + i + ". pozici");
    i = s.lastIndexOf('a');
    System.out.println("Posledni a je na " + i + ". pozici");
    i = s.lastIndexOf('a', i - 1);
    System.out.println("Predposledni a je na "+ i +". pozici");
  }
}
