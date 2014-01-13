package cz.heroult.pavel.java.book.Kap18.S304;

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

public class IoZnaky2 {
  public static void main(final String[] args) throws IOException {
    File frJm = new File("a.txt");
    FileReader fr = new FileReader(frJm);

    FileWriter fw = new FileWriter("b.txt");

    long delka = frJm.length();
    int c;

    for (long i = 0;  i < delka;  i++) {
      c = fr.read();
      fw.write(c);
    }
    fr.close();
    fw.close();
  }
}
