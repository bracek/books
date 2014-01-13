package cz.heroult.pavel.java.book.Kap18.S312;

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

public class ScannerCyklus {
  public static void main(final String[] args) throws IOException {
    Scanner sc = new Scanner(new File("buf.txt"));
    int suma = 0;
    while (sc.hasNextInt() == true) {
      suma += sc.nextInt();
    }
    System.out.println("suma = " + suma); 
  }
}
