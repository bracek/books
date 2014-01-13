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

class Osoba implements Comparable<Osoba> {

    int vyska;
    double vaha;
    String popis;

    Osoba(int vyska, double vaha, String popis) {
        this.vyska = vyska;
        this.vaha = vaha;
        this.popis = popis;
    }

    public int compareTo(final Osoba os) {
        return this.vyska - os.vyska;
    }

    public String toString() {
        return "\r\nvy = " + vyska + ", va = " + vaha + ", " + popis;
    }
}

class KomparatorOsobyPodleVysky implements Comparator<Osoba> {

    public int compare(final Osoba os1,
final  Osoba os2) {
        return os1.vyska - os2.vyska;
    }
}

class KomparatorOsobyPodleVahy implements Comparator<Osoba> {

    public int compare(final Osoba os1,
final  Osoba os2) {
        return (int) (os1.vaha - os2.vaha);
    }
}

public class OsobaCollections {

    public static void main(final String[] args) {
        List<Osoba> sez = new ArrayList<Osoba>();
        sez.add(new Osoba(186, 82.5, "muz"));
        sez.add(new Osoba(172, 63.0, "zena"));
        sez.add(new Osoba(105, 26.1, "dite"));
        sez.add(new Osoba(116, 80.5, "obezni trpaslik"));

        Collections.sort(sez, new KomparatorOsobyPodleVahy());
        System.out.println("Abs. razeni podle vahy: " + sez);

        Collections.reverse(sez);
        System.out.println("Podle vahy sestupne: " + sez);

        Collections.shuffle(sez);
        System.out.println("Zamichano: " + sez);

        System.out.println("Nejvyssi:" + Collections.max(sez));
        System.out.println("Nejlehci:" + Collections.min(sez,
                new KomparatorOsobyPodleVahy()));

        Osoba robot = new Osoba(180, 75.0, "robot");
        Collections.fill(sez, robot);
        System.out.println("Vyplneno: " + sez);
        int pocet = Collections.frequency(sez, robot);
        System.out.println("Pocet robotu: " + pocet);
    }
}
