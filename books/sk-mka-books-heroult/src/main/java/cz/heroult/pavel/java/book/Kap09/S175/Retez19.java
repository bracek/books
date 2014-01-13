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

public class Retez19 {
  public static void main(final String[] args) {
    String s1 = "\r\n\t cacao\t \r\n";
    int i;

    i = s1.trim().toUpperCase().substring(2).indexOf('O');
    System.out.println("O je " + (i + 1) + ".znak");
  }
}
