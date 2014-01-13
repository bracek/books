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

public class ZipFileMode {
  public static void main(final String[] args) throws IOException {
    File f = new File("pokus.zip");
//    ZipFile zf = new ZipFile(f, ZipFile.OPEN_READ);
//    ZipFile zf = new ZipFile(f, ZipFile.OPEN_READ | ZipFile.OPEN_DELETE);
    ZipFile zf = new ZipFile(f, ZipFile.OPEN_DELETE);
    System.out.println("pocet zapakovanych polozek: " + zf.size());
  }
}
