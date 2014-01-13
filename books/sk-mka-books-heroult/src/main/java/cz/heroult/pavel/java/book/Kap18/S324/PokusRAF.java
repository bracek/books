package cz.heroult.pavel.java.book.Kap18.S324;

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

public class PokusRAF {
  public static void main(final String[] args) throws IOException {
    RandomAccessFile frw = new RandomAccessFile("a.bin", "rw");
    int k, pocet = 5;
    long posun;
  
    frw.writeInt(pocet);
    for (int i = 0;  i < pocet;  i++) {
      k = (int) (1000.0 * Math.random());
      System.out.print(k + " ");
      frw.writeInt(k);
    }
    frw.writeDouble(Math.PI);
    frw.writeDouble(Math.E);
    System.out.println("\n" + Math.PI + " " + Math.E);
    System.out.println("Velikost souboru: " 
                                      + frw.getFilePointer());
    System.out.println("Velikost souboru: " + frw.length());

    frw.seek(0L);          // n�vrat na za��tek
    pocet = frw.readInt();
    posun = 4 * pocet;     // int je velk� 4 bajty
    frw.seek(posun);
    frw.writeInt(1234);    // p�eps�n� posledn�ho int v souboru
    frw.seek(posun);
    k = frw.readInt();
    System.out.print(k);

    frw.skipBytes(8);      // double je velk� 8 bajt�
    double e = frw.readDouble();
    System.out.println("\n" + e);
    frw.close();
  }
}
