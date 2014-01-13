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

public class EliminaceDuplicit {
  public static void main(final String[] args) {
    Collection<String> d = new ArrayList<String>();
    d.add("prvni");
    d.add("druhy");
    d.add("prvni");
    System.out.println("Duplicitni:   " + d);
    Collection<String> nd = new ArrayList<String>(
                 new HashSet<String>(d));
    System.out.println("NEduplicitni: " + nd);
  }
}
