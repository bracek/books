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

class Hruska1 {

    private int cena;

    Hruska1(int cena) {
        this.cena = cena;
    }

    public String toString() {
        return "" + cena;
    }

    public void tisk() {
        System.out.print(cena + ", ");
    }
}

public class IteratorZakladniPouziti {

    public static void main(final String[] args) {
        ArrayList<Hruska1> kosHrusek = new ArrayList<Hruska1>();
        for (int i = 0; i < 10; i++) {
            kosHrusek.add(new Hruska1(i + 20));
        }

        for (Iterator<Hruska1> it = kosHrusek.iterator(); it.hasNext();) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        Iterator<Hruska1> it = kosHrusek.iterator();
        while (it.hasNext()) {
            it.next().tisk();
        }
        System.out.println();
    }
}
 
