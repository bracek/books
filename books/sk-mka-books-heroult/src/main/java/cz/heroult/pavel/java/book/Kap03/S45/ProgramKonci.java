package cz.heroult.pavel.java.book.Kap03.S45;

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

public class ProgramKonci {
  public static void main(final String[] args) throws Exception {
    OutputStreamWriter o = new OutputStreamWriter(System.out, "Cp852");
    /* Cp852 je v�stupn� k�dov�n� �e�tiny v DOSov�m ok�nku */
    PrintWriter p = new PrintWriter(o);
    p.print("Program kon\u010D\u00ED!\n\007");
    p.close();
  }
}
