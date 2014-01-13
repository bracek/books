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

class Ovocie {

    int cena;
    String typ;

    Ovocie(int cena) {
        this.cena = cena;
        this.typ = "jablko";   // pro jednoduchost
    }

    @Override
    public String toString() {
        return typ + ":" + cena + " Kc";
    }

    @Override
    public int hashCode() {
        return cena;
    }
}

public class ChybneHesovaniNeprekrytaEquals {

    public static void main(final String[] args) {
        System.out.println("Chybne hesovani");
        HashSet<Ovocie> OvocieSet = new HashSet<Ovocie>();
        for (int i = 6; i <= 8; i++) {
            OvocieSet.add(new Ovocie(i));
        }
        System.out.println("OvocieSet: " + OvocieSet);
        System.out.println("obsahuje 7: " + OvocieSet.contains(new Ovocie(7)));
    }
}
