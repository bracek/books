package cz.heroult.pavel.java.book.Kap18.S303;

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

public class IoZnaky {
  public static void main(final String[] args) throws IOException {
    File frJm = new File("a.txt");
    File fwJm = new File("b.txt");

    if (frJm.exists() == true) {
      FileReader fr = new FileReader(frJm);
      FileWriter fw = new FileWriter(fwJm);
      int c;

      while ((c = fr.read()) != -1)
        fw.write(c);

      fr.close();
      fw.close();
    }
  }
}
