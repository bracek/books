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

public class NeshodaPrvkuMnozin {

    public static void main(final String[] args) {
        Set<String> m1 = new HashSet<String>();
        Collections.addAll(m1, "1", "2", "3", "4");
        Set<String> m2 = new HashSet<String>();
        Collections.addAll(m2, "5", "6", "7");
        Set<String> m3 = new HashSet<String>();
        Collections.addAll(m3, "4", "5");

        System.out.println(m1 + " a " + m2 + " jsou rozdilne: " + Collections.disjoint(m1, m2));
        System.out.println(m1 + " a " + m3 + " jsou rozdilne: " + Collections.disjoint(m1, m3));
    }
}
