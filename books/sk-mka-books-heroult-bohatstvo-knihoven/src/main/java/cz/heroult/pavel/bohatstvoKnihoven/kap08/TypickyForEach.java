package cz.heroult.pavel.bohatstvoKnihoven.kap08;

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

public class TypickyForEach {

    public static void main(final String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(new Integer(1));
        ar.add(new Integer(2));
        for (Integer i : ar) {
            System.out.print(i.intValue() + ", ");
        }
    }
}
