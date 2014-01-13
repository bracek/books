package cz.heroult.pavel.java.book.Kap07.S134;

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

import java.util.Arrays;

public class TiskPole {
  public static void main(final String[] args) {
    int[] poleInt = { 1, 7, 5, 3 };
    String s = Arrays.toString(poleInt);
    System.out.println("pole: " + s);
  }
}
