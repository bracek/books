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

class Ovoce {

    int cena;
    String typ;

    Ovoce(int cena) {
        this.cena = cena;
        this.typ = "jablko";   // pro jednoduchost
    }

    @Override
    public String toString() {
        return typ + ":" + cena + " Kc";
    }
}

public class ChybneHesovaniAdresy {

    public static void main(final String[] args) {
        HashSet<Ovoce> ovoceSet = new HashSet<Ovoce>();
        for (int i = 6; i <= 8; i++) {
            ovoceSet.add(new Ovoce(i));
        }
        System.out.println("ovoceSet: " + ovoceSet);

        for (Ovoce o : ovoceSet) {
            System.out.print(o.hashCode() + ", ");
        }
        System.out.println();
        System.out.println(new Ovoce(7).hashCode());
        System.out.println("Integer: " + new Integer(7).hashCode());

        
        


    }
}
