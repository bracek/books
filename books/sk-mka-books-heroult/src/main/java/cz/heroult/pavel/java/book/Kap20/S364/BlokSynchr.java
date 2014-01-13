package cz.heroult.pavel.java.book.Kap20.S364;

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

public class BlokSynchr {
  RandomAccessFile file;

  BlokSynchr(RandomAccessFile f) {
    file = f;
  }

  public void presun(final long kam) throws IOException {
    synchronized (file) {
      file.seek(kam);
    }
  }

  public int ctiInt() throws IOException {
    synchronized (file) {
      return file.readInt();
    }
  }
}
