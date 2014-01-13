package cz.heroult.pavel.java.book.Kap18.S313;

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

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderSplit {
  public static void main(final String[] args) throws IOException {
    BufferedReader bfr = new BufferedReader(
                         new FileReader("buf.txt"));
    String radka;
    int suma = 0;
    while((radka = bfr.readLine()) != null) {
      String[] cisla = radka.split(" ");
      for (String cislo : cisla) {
        suma += Integer.parseInt(cislo);
      }
    }
    System.out.println("Soucet je: " + suma);
    bfr.close();
  }
}
