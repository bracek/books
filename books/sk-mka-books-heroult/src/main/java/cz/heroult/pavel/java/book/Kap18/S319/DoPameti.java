package cz.heroult.pavel.java.book.Kap18.S319;

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

import java.io.*;

public class DoPameti {
  public static void main(final String[] args) throws IOException {
    StringWriter sProud = new StringWriter();
    PrintWriter form = new PrintWriter(sProud);

    for (int i = 1;  i <= 3;  i++) {
      form.print(i + ". ahoj " + (4 - i) + "\n");
      System.out.println(sProud);
    }
    form.close();
  }
}


