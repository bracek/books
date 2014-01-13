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

public class PoradiVMapach {
  private static String[] pole = {"1", "6", "2", "5", "4", "3"};

  static void nastaveniATisk(final Map<String,
final  String> m) {
    for (int i = 0; i < pole.length;  i++) {
      m.put(pole[i], "A");
    }
    System.out.println(m.getClass().getName() + ":\t" + m);
  }

  public static void main(final String[] args) {
    nastaveniATisk(new HashMap<String, String>());
    nastaveniATisk(new TreeMap<String, String>());
    nastaveniATisk(new LinkedHashMap<String, String>());
  }
}
