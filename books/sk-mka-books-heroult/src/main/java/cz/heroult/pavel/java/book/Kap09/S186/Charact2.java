package cz.heroult.pavel.java.book.Kap09.S186;

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

public class Charact2 {
  public static void main(final String[] args) throws Exception {
    char c, d = 'A';

    c = Character.toLowerCase(d);
    System.out.println("c = "+ c +" d = "+ d);   // c = a d = A
    d = Character.toUpperCase('\u00FD');         // '\u00FD' je '�' 
    System.out.println("d = " + d);              // d = �

    OutputStreamWriter o = new OutputStreamWriter(System.out, "Cp852");
    /* Cp852 je v�stupn� k�dov�n� �e�tiny v DOSov�m ok�nku */
    PrintWriter p = new PrintWriter(o);
    p.print("d po zm�n� �e�tiny = " + d);
    p.close();
  }
}
