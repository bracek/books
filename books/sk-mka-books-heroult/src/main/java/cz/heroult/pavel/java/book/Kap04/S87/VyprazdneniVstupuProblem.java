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

public class VyprazdneniVstupuProblem {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Zadej prvni cele cislo: ");
    int i1 = sc.nextInt();
    System.out.println("Zadal jsi: " + i1);

    System.out.print("Zadej retezec: ");
    String s = sc.next();
    System.out.println("Zadal jsi: " + s);
    
    System.out.print("Zadej znak: ");
    char c = sc.nextLine().charAt(0);
    System.out.println("Zadal jsi: " + c);
    
    System.out.print("Zadej druhe cele cislo: ");
    int i2 = sc.nextInt();
    System.out.println("Zadal jsi: " + i2);
  }
}
