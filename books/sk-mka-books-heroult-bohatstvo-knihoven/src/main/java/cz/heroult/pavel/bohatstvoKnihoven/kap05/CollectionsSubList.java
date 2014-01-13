package cz.heroult.pavel.bohatstvoKnihoven.kap05;


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

public class CollectionsSubList {

    public static void main(final String[] args) {
        String[] vse = {"1", "2", "3", "1", "2", "3"};
        String[] cast = {"2", "3"};
        List<String> list = Arrays.asList(vse);
        System.out.println(list);
        List<String> subList = Arrays.asList(cast);
        int prvni = Collections.indexOfSubList(list, subList);
        int posledni = Collections.lastIndexOfSubList(list, subList);
        System.out.println(subList + " je na " + prvni + ". pozici");
        System.out.println(subList + " je na " + posledni + ". posledni pozici");
    }
}
