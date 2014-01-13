package cz.heroult.pavel.bohatstvoKnihoven.kap10;

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

import java.util.*;

public class TrikySubSet {
  public static void main(final String[] args) {
    String[] s = {"ahoj", "babi", "co", "dela", "deda", "a", "eva"};
    System.out.println(Arrays.asList(s));
    TreeSet<String> ts = new TreeSet<String>(Arrays.asList(s));
    System.out.println(ts);
    SortedSet<String> sub = ts.subSet("b", "e");
    System.out.println("Pocet slov mezi 'b' a 'e': " + sub.size() + " " + sub);

    System.out.println("Triky s mezemi");
    sub = ts.subSet("a", "co");
    System.out.println("Pocet slov mezi 'a' a 'co':        "
                                            + sub.size() + " " + sub);
    sub = ts.subSet("a", "co\0");
    System.out.println("Pocet slov mezi 'a' a 'co' vcetne: "
                                             + sub.size() + " " + sub);
    sub = ts.subSet("a\0", "co");
    System.out.println("Pocet slov mezi 'a' a 'co' bez:    "
                                             + sub.size() + " " + sub);

    System.out.println();
    ts.subSet("d", "e").clear();
    System.out.println("Bez slov od 'd': " + ts);

    System.out.println("Predchudci a naslednici");
    String pred = (String) ts.headSet("babi").last();
    System.out.println("Predchudce 'babi': " + pred);
    String po = (String) ts.tailSet("babi\0").first();
    System.out.println("Naslednik 'babi': " + po);

    System.out.println("Pocty slov od jednotlivych pismen");
    for (char ch = 'a';  ch <= 'e';  ch++) {
      String zac = new String(new char[] {ch});
      String kon = new String(new char[] {(char)(ch+1)});
      System.out.println(zac + ": " + ts.subSet(zac, kon).size());
    }
  }
}

