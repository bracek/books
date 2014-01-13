package cz.heroult.pavel.bohatstvoKnihoven.kap13;

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

public class PoradiVSeznamech {
  public static void main(final String[] args) {
    String[] pole = {"1", "6", "2", "5", "4", "3"};
    HashSet<String> hs = new HashSet<String>(Arrays.asList(pole));
    TreeSet<String> ts = new TreeSet<String>(Arrays.asList(pole));
    LinkedHashSet<String> lhs = new LinkedHashSet<String>(Arrays.asList(pole));
    System.out.println("Original:      " + Arrays.toString(pole));
    System.out.println("HashSet:       " + hs);
    System.out.println("TreeSet:       " + ts);
    System.out.println("LinkedHashSet: " + lhs);
  }
}
