package cz.heroult.pavel.java.book.Kap05.S109;

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

import java.util.Scanner;

public class Switch3 {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    switch (sc.nextLine().charAt(0))  {
      default :
        System.out.println("Nestiskl jsi ani '1' ani '2'");
        break;

      case '1' :
        System.out.println("Stiskl jsi '1'");
        break;

      case '2' :
        System.out.println("Stiskl jsi '2'");
        break;
     }
  }
}
