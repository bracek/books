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

public class CollectionsRotate {

    public static void main(final String[] args) {
        String[] vse = {"1", "2", "3", "4", "5", "6"};
        List<String> list = Arrays.asList(vse);
        System.out.println("puvodni           " + list);
        Collections.rotate(list, 1);
        System.out.println("po rotaci doprava " + list);
        Collections.rotate(list, -1);
        System.out.println("po rotaci doleva  " + list);
        Collections.rotate(list.subList(1, 4), 1);
        System.out.println("po rotaci doprava " + list);
    }
}
