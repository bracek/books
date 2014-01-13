package cz.heroult.pavel.java.book.Kap12.S230;

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
import java.io.LineNumberReader;
import java.io.IOException;

public class Balik {
  public static void main(final String[] args)
                                 throws IOException {
    FileReader f = new FileReader("a.txt");
    LineNumberReader lf = new LineNumberReader(f);
    System.out.println(lf.readLine());
    f.close();
  }
}
