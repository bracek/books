package cz.heroult.pavel.java.book.Kap02.S28;

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
import java.util.*;

public class Soubory2 {
  public static void main(final String[] argv) throws IOException{
    File soub = new File("b.txt");
    File adr = new File("TMP");

    System.out.println(new Date(soub.lastModified()));
    System.out.println(new Date(adr.lastModified()));

    System.out.println(soub.length());
    System.out.println(adr.length());

    File jiny = new File("c.txt");
    soub.renameTo(jiny);
    adr.renameTo(new File("TMP-OLD"));

    soub.delete();   // nevyma�e c.txt
    adr.delete();    // nevyma�e TMP-OLD
    jiny.delete();   // skute�n� vymaz�n� c.txt
  }
}
