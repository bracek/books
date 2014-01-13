package cz.heroult.pavel.java.book.Kap19.S335;

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

public class Sy4 {
  public static void main(final String[] args) throws IOException {
    String oddRadek = System.getProperty("line.separator");
    String oddSouboru = System.getProperty("file.separator");
    File adr = new File("TMP");

    adr.mkdir();
    String jmenoSouboru = adr.getName() + oddSouboru + "a.txt";
    FileOutputStream fw = new FileOutputStream(jmenoSouboru);
    PrintStream fwPr = new PrintStream(fw);

    fwPr.print("Jedna radka");
    fwPr.print(oddRadek);
    fwPr.println("Druha radka");
    fwPr.println("Treti radka");
    fw.close();
  }
}
