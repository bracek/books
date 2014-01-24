package cz.heroult.pavel.bohatstvoKnihoven.kap01;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                 Java -- bohatstv� knihoven                  //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       CTI_ME.TXT                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2003                      // 
//                                                             //
/////////////////////////////////////////////////////////////////


import java.util.*;
import java.text.*;
import java.io.*;


class KomparatorCeskychAkcentovanychStringu implements Comparator {
  private Collator col = Collator.getInstance(new Locale("cs","CZ"));

  public int compare(final Object o1,
final  Object o2) {
    String s1 = (String) o1;
    String s2 = (String) o2;
    return col.compare(s1, s2);
  }
}

public class ArraysAbsolutniRazeniAkcentovanychStringu {
  public static void main(final String[] args) throws IOException {
    OutputStreamWriter o = new OutputStreamWriter(System.out, "Cp852");
    PrintWriter p = new PrintWriter(o);

    String[] akcentovaneRetezce = {
      "nov� v�k", "Nov� Sv�t", "Nov� sv�t", "nov� Sv�t", 
      "nov� sv�t", "Nov� Svet", "Nov� svet",
      "abc traktoristy", "ABC n�stroja�e",
      "abc n�stroja�e", "ABC kov��e", "ABC klemp��e",
      "abc fr�za�e", "ABC", "Abc", "abc", "A", "a" };

    Arrays.sort(akcentovaneRetezce, 
                new KomparatorCeskychAkcentovanychStringu());

    for (int i = 0;  i < akcentovaneRetezce.length;  i++)
      p.println(akcentovaneRetezce[i]);

    p.flush();
  }
}
