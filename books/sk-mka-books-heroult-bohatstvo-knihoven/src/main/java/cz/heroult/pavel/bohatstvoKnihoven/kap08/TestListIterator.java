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

public class TestListIterator {

    public static void main(final String[] argv) {
        String[] tmp = {"1", "2", "3", "4", "5"};
        List<String> list = new ArrayList<String>(Arrays.asList(tmp));
        System.out.println("Seznam:          " + list);

        System.out.print("Seznam pozpatku: [");
        for (ListIterator<String> it = list.listIterator(list.size());
                it.hasPrevious();) {
            System.out.print(it.previous() + ", ");
        }
        System.out.println("]");
    }
}


