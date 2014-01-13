package cz.heroult.pavel.java.book.Kap06.S116;

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

public class Metody2 {
  
  static int secti() {
    Scanner sc = new Scanner(System.in);
    int a, b;

    a = sc.nextInt();
    b = sc.nextInt();
    return (a + b);
  }

  public static void main(final String[] args) {    
    System.out.print("Zadej dve cela cisla: ");
    System.out.println(secti());
  }
}
