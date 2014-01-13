package cz.heroult.pavel.java.book.Kap05.S100;

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

public class DoWhile {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    char c;
    do {
      if ((c = sc.nextLine().charAt(0)) >= 'a')
        System.out.print(c);
    } while (c != 'z');

    System.out.println("\nCteni znaku bylo ukonceno.");
  }
}
