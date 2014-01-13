package cz.heroult.pavel.java.book.Kap04.S84;

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

public class VypisRetezec {
  public static void main(final String[] args) {
    String s = "Dobr� den";
    System.out.format("s = %s%n", s); // s = Dobr� den
    System.out.format("s = %S%n", s); // s = DOBR� DEN
    System.out.format("s = |%11s|%n", s);  // s = |  Dobr� den|
    System.out.format("s = |%-11s|%n", s); // s = |Dobr� den  |
  }
}
 
