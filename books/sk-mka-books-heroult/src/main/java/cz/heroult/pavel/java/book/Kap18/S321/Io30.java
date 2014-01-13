package cz.heroult.pavel.java.book.Kap18.S321;

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

public class Io30 {
  public static Reader vyber(final Reader vstup,
final int index,
final char znak)
                                        throws IOException {
    BufferedReader bufVstup = new BufferedReader(vstup);

    PipedWriter rouraVystup = new PipedWriter();
    PipedReader rouraVstup = new PipedReader(rouraVystup);

    PrintWriter formRouraVystup = new PrintWriter(rouraVystup);

    String radka;

    while((radka = bufVstup.readLine()) != null) {
      if (index < radka.length() 
          &&  radka.charAt(index) == znak)
        formRouraVystup.println(radka);
    }

    formRouraVystup.close();
    return rouraVstup;
  }

  public static void main(final String[] argv) throws IOException {
    FileReader fr = new FileReader("data120.txt");
    Reader jednaDevet = vyber(vyber(fr, 0, '1'), 2, '9');
    fr.close();

    String radka;                          // z�v�re�n� tisk
    BufferedReader br = new BufferedReader(jednaDevet);

    while((radka = br.readLine()) != null) {
      System.out.println(radka);
    }

    br.close();
  }
}


