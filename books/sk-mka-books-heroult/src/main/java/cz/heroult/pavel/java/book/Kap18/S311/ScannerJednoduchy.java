package cz.heroult.pavel.java.book.Kap18.S311;

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
import java.util.Locale;
import java.io.File;
import java.io.IOException;

public class ScannerJednoduchy {
  public static void main(final String[] args) throws IOException {
    Scanner sc = new Scanner(new File("data-scanner.txt"));
    sc.useLocale(Locale.US); 
    int i = sc.nextInt();
    double d = sc.nextDouble();
    String s = sc.next();
    System.out.println("i = " + i 
              + ", d = " + d + ", s = " + s);
  }
}
