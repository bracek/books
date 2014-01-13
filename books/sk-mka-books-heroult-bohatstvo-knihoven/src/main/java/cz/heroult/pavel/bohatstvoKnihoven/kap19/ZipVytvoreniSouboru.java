package cz.heroult.pavel.bohatstvoKnihoven.kap19;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                   Java -- bohatstv� knihoven                //
//                II. opraven� a roz���en� vyd�n�              //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       Cti_me.txt                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2006                      // 
//                                                             //
/////////////////////////////////////////////////////////////////

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.zip.*;

public class ZipVytvoreniSouboru {
  public static void main(final String[] args) throws IOException {
    FileOutputStream fo = new FileOutputStream("vystup.zip");
    ZipOutputStream zfo = new ZipOutputStream(fo);
    File fi = new File("ahoj.txt");
    FileInputStream fis = new FileInputStream(fi);
    long delka = fi.length();
    byte[] obsahSouboru = new byte[(int) delka];
    fis.read(obsahSouboru);
    fis.close();

    for (int i = 1;  i <= 3;  i++) {
      String jmenoAdresare = "adr" + i + "/";
      ZipEntry zeAdr = new ZipEntry(jmenoAdresare);
      zfo.putNextEntry(zeAdr);
      zfo.closeEntry();

      String jmenoSouboru = jmenoAdresare + "ahoj" + i + ".txt";
      ZipEntry zeSoub = new ZipEntry(jmenoSouboru);
      zfo.putNextEntry(zeSoub);
      zfo.write(obsahSouboru);
      zfo.closeEntry();
    }
    zfo.close();
  }
}
