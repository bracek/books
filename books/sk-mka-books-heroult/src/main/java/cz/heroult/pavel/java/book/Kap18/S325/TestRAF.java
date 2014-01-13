package cz.heroult.pavel.java.book.Kap18.S325;

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

public class TestRAF { 
  public static void main(final String[] args) throws IOException {
    RandomAccessFile fr = new RandomAccessFile("f.txt", "r");
    String radka;
    int pocet = 0;
    long[] ofsety = new long[10];
    ofsety[0] = 0;
    while ((radka = fr.readLine()) != null) {
      pocet++;
      ofsety[pocet] = fr.getFilePointer();
      System.out.println(radka);
      if (radka.endsWith("\r") == true)
        System.out.println("\r");
    }

    fr.seek(0L);
    for (int i = pocet - 1;  i > -1;  i--) {
      fr.seek(ofsety[i]);
      radka = fr.readLine();
      System.out.println(radka);
    }
    fr.close();
  }
}
