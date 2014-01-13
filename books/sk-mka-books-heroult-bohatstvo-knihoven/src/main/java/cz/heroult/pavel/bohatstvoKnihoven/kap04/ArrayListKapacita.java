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

public class ArrayListKapacita {

    public static final int POKUSU = 1000000;

    public static void main(final String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        long zac = System.currentTimeMillis();
        for (int i = 0; i < POKUSU; i++) {
            ar.add(new Integer(i));
        }
        long kon = System.currentTimeMillis();
        System.out.println("Trvani bez kapacity:      " + (kon - zac) + " [msec]");
        ar = null;
//    System.gc();

        ar = new ArrayList<Integer>(POKUSU);
        zac = System.currentTimeMillis();
        for (int i = 0; i < POKUSU; i++) {
            ar.add(new Integer(i));
        }
        kon = System.currentTimeMillis();
        System.out.println("Trvani s plnou kapacitou: " + (kon - zac) + " [msec]");
    }
}
