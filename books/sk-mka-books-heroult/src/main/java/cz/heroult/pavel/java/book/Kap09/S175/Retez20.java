package cz.heroult.pavel.java.book.Kap09.S175;

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

public class Retez20 {
  public static void main(final String[] args) {
    int i;

    i = "dlouhy retezec".indexOf('y');
    System.out.println("i = " + i);
    String s = "obr".concat(String.valueOf(i)).concat(".jpg");    
    System.out.println("s = " + s);
  }
}
