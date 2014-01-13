package cz.heroult.pavel.java.book.Kap04.S87;

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

import java.util.*;

public class NacitaniRealnychCisel {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US); 
    
    System.out.print("Zadej 1. odvesnu: ");
    double d1 = sc.nextDouble();
    System.out.print("Zadej 2. odvesnu: ");
    double d2 = sc.nextDouble();
    double prepona = Math.sqrt(d1 * d1 + d2 * d2);
    System.out.println("Prepona je: " + prepona);
  }
}
