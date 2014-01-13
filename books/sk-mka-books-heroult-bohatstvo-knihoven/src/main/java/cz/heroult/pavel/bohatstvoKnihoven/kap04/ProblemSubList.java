package cz.heroult.pavel.bohatstvoKnihoven.kap04;


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

public class ProblemSubList {

    public static void main(final String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            ar.add(new Integer(i + 10));
        }
        System.out.println("Cely seznam: " + ar);
        List<Integer> sl = ar.subList(2, 5);
        System.out.println("Podseznam:   " + sl);

        System.out.println("Ubrani prvku[2] z celeho seznamu");
        ar.remove(2);                  // "poskodi" sublist
//    ar.add(2, new Integer(77));  // "poskodi" sublist

        sl.remove(0);
        sl.add(2, new Integer(77));

        System.out.println("Cely seznam: " + ar);
        System.out.println("Podseznam:   " + sl);
    }
}

