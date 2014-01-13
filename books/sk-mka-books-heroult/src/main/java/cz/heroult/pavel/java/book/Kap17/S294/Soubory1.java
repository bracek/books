package cz.heroult.pavel.java.book.Kap17.S294;

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

public class Soubory1 {
  public static void main(final String[] argv) throws IOException{
    String aktDir = System.getProperty("user.dir");
    File novySou = new File("b.txt");
    File novyAdr = new File("TMP");

    if (novySou.exists() == true)
      System.out.println("b.txt existuje");
    else
      novySou.createNewFile();

    if (novySou.isFile() == true)
      System.out.println("b.txt je soubor");

    if (novyAdr.exists() == true)
      System.out.println("TMP existuje");
    else
      novyAdr.mkdir();
    if (novyAdr.isDirectory() == true)
      System.out.println("TMP je adresar");
  }
}
