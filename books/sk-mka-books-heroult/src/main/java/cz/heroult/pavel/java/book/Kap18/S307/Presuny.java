package cz.heroult.pavel.java.book.Kap18.S307;

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

public class Presuny {
  public static void main(final String[] args) throws IOException {
    File frJm = new File("a.txt");
    FileReader fr = new FileReader(frJm);

    FileWriter fw = new FileWriter("b.txt");

    long delka = frJm.length();
    int c;

    // prvni kopirovani od zacatku
    for (long i = 0;  i < delka;  i++) {
      c = fr.read();
      fw.write(c);
    }

    fr.close();  // pon�kud nep�ehledn� p�esun na za�. souboru
    fr = new FileReader(frJm);
//    fr.reset();   // nen� t�mto proudem podporov�no

    fw.close();
    fw = new FileWriter("b.txt", true);

    // druhe kopirovani z poloviny
    fr.skip(delka / 2);
    while((c = fr.read()) != -1)
      fw.write(c);

    fr.close();
    fw.close();
  }
}
