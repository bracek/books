package cz.heroult.pavel.java.book.Kap18.S309;

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

public class VraceniZnaku {
  public static void main(final String[] argv) throws IOException {
    FileReader fr = new FileReader("a.txt");
    PushbackReader in = new PushbackReader(fr);
    int c;

    c = in.read();
    System.out.print((char) c);
    in.unread(c);
    c = in.read();
    System.out.print((char) c);

    in.close();
  }
}
