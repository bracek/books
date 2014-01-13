package cz.heroult.pavel.java.book.Kap18.S308;

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

public class PoRadcich {
  public static void main(final String[] argv) throws IOException {
    FileReader fr = new FileReader("a.txt");
    BufferedReader in = new BufferedReader(fr);
    FileWriter fw = new FileWriter("b.txt");
    BufferedWriter out = new BufferedWriter(fw);
    String radka;

    while((radka = in.readLine()) != null) {
      System.out.println(radka);
      out.write(radka);
      out.newLine();
    }

    fr.close();
    out.close();
  }
}
