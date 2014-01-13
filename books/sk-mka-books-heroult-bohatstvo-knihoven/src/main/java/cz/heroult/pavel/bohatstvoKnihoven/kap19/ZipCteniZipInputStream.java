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

public class ZipCteniZipInputStream {
  public static void main(final String[] args) throws IOException {
    File f = new File("pokus.zip");
    FileInputStream fis = new FileInputStream(f);
    ZipInputStream zfis = new ZipInputStream(fis);
    int cisloPolozky = 0;
    ZipEntry ze;
    while ((ze = zfis.getNextEntry()) != null) {
      System.out.println("Polozka cislo: " + (++cisloPolozky));
      System.out.print("  jmeno: " + ze.getName());
      System.out.print(", komprimovana velikost: " + ze.getCompressedSize());
      System.out.print(", skutecna velikost: " + ze.getSize());
      Date d = new Date(ze.getTime());
      DateFormat df = DateFormat.getDateInstance();
      System.out.println(", datum: " + df.format(d));
      if (ze.isDirectory())
        continue;
      int len = (int) ze.getSize();
      byte[] b = new byte[len];
      zfis.read(b);
      System.out.println(new String(b));
    }
    zfis.close();
    fis.close();
  }
}
