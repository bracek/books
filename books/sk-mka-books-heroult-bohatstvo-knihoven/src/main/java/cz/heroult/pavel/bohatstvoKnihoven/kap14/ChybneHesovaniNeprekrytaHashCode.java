package cz.heroult.pavel.bohatstvoKnihoven.kap14;

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

class OvoceX {

    int cena;
    String typ;

    OvoceX(int cena) {
        this.cena = cena;
        this.typ = "jablko";   // pro jednoduchost
    }

    @Override
    public String toString() {
        return typ + ":" + cena + " Kc";
    }
}

public class ChybneHesovaniNeprekrytaHashCode {

    public static void main(final String[] args) {
        System.out.println("Fungujici hasovani");
        HashSet<Integer> intSet = new HashSet<Integer>();
        for (int i = 6; i <= 8; i++) {
            intSet.add(new Integer(i));
        }
        System.out.println("intSet: " + intSet);
        System.out.println("obsahuje 7: " + intSet.contains(new Integer(7)));

        System.out.println("\nChybne hasovani");
        HashSet<OvoceX> ovoceSet = new HashSet<OvoceX>();
        for (int i = 6; i <= 8; i++) {
            ovoceSet.add(new OvoceX(i));
        }
        System.out.println("ovoceSet: " + ovoceSet);
        System.out.println("obsahuje 7: " + ovoceSet.contains(new OvoceX(7)));
    }
}
