package cz.heroult.pavel.bohatstvoKnihoven.kap07;


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

class Vojak implements Comparable<Vojak> {

    private int pocetHvezdicek;
    private String hodnost;
    private String typVojska;

    public Vojak(final int pocetHvezdicek,
final  String hodnost,
final  String typVojska) {
        this.pocetHvezdicek = pocetHvezdicek;
        this.hodnost = hodnost;
        this.typVojska = typVojska;
    }

    // prirozene razeni je v armade sestupne ;-)
    public int compareTo(final Vojak v) {
        return v.pocetHvezdicek - this.pocetHvezdicek;
    }

    public String toString() {
        return "\n" + pocetHvezdicek + " " + hodnost + " " + typVojska;
    }
}

public class PouzitiPriorityQueue {

    public static void main(final String[] args) {
        Queue<Vojak> kantyna = new PriorityQueue<Vojak>();
        kantyna.add(new Vojak(1, "major", "letectvo"));
        kantyna.add(new Vojak(3, "plukovnik", "pechota"));
        kantyna.add(new Vojak(2, "podplukovnik", "policie"));
        kantyna.add(new Vojak(3, "plukovnik", "spojari"));
        kantyna.add(new Vojak(4, "nadplukovnik", "chemici"));
        System.out.println("Fronta najednou: " + kantyna);

        System.out.print("\nPoradi vydeje jidel:");
        while (kantyna.isEmpty() == false) {
            System.out.print(kantyna.remove());
        }
    }
}
