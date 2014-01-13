package cz.heroult.pavel.java.book.Kap18.S310;

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

public class FormatovaniVystupu {
  public static void main(final String[] argv) throws IOException {
    FileWriter fwForm = new FileWriter("form.txt");
    PrintWriter form = new PrintWriter(fwForm);
    FileWriter fwNeform = new FileWriter("neform.txt");

    for (int i = 65;  i < 75;  i++) {
      System.out.print(i + " ");
      form.print(i + " ");
//      form.format("%d ", i);
      fwNeform.write(i);
    }

    form.close();
    fwNeform.close();
  }
}
