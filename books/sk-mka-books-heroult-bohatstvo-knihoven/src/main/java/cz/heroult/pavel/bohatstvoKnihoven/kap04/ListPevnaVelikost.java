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

public class ListPevnaVelikost {

    public static void main(final String[] args) {
        List<String> karty = Arrays.asList(new String[8]);
        System.out.println(karty);
        karty.set(0, "7");
        karty.set(1, "8");
        karty.set(6, "kral");
        karty.set(7, "eso");
        System.out.println(karty);
        karty.add("falesne eso");
    }
}
