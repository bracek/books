package cz.heroult.pavel.bohatstvoKnihoven.kap12;

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

public class CollectionsSingleton {
  public static void main(final String[] args) {
    List<String> list = new ArrayList<String>();
    Collections.addAll(list, "1", "2", "3", "4", "5", "2");
    System.out.println(list);
    list.removeAll(Collections.singletonList("2"));
    System.out.println("po odebrani " + list);
  }
}
