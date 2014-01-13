package cz.heroult.pavel.bohatstvoKnihoven.kap11;

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

public class FrekvenceSlovVMape {
  static void cetnost(final Map<String,
final  Integer> m) {
    String[] s = {"lesni", "vily", "vence", "vily", "a", "psi",
                  "z", "vily", "na", "ne", "vyli"};
    for (int i = 0;  i < s.length;  i++) {
        Integer cet = (Integer) m.get(s[i]);
        cet = (cet == null ? new Integer(1) :
                             new Integer(cet.intValue() + 1));
        m.put(s[i], cet);
    }

    System.out.print(m.getClass().getName());
    System.out.println(" -- nalezeno " + m.size() + " rozdilnych slov");
    System.out.println(m);
  }

  public static void main(final String args[]) {
    cetnost(new HashMap<String, Integer>());
    cetnost(new TreeMap<String, Integer>());
  }
}
