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

class Jmeno implements Comparable<Jmeno> {

    private String krestni,  prijmeni;

    public Jmeno(final String krestni,
final  String prijmeni) {
        if (krestni == null || prijmeni == null) {
            throw new NullPointerException();
        }
        this.krestni = krestni;
        this.prijmeni = prijmeni;
    }

    public String krestni() {
        return krestni;
    }

    public String prijmeni() {
        return prijmeni;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if ((o instanceof Jmeno) == false) {
            return false;
        }
        Jmeno j = (Jmeno) o;
        boolean stejneKrestni = krestni.equals(j.krestni);
        boolean stejnePrijmeni = prijmeni.equals(j.prijmeni);
        return stejneKrestni && stejnePrijmeni;
    }

    @Override
    public int hashCode() {
        int vysledek = 17;
        vysledek = 37 * vysledek + krestni.hashCode();
        vysledek = 37 * vysledek + prijmeni.hashCode();
        return vysledek;
    }

    @Override
    public String toString() {
        return krestni + " " + prijmeni;
    }

    public int compareTo(final Jmeno j) {
        int pom = prijmeni.compareTo(j.prijmeni);
        return (pom == 0 ? krestni.compareTo(j.krestni) : pom);
    }
}

public class TypickyPrvekKolekce {

    public static void main(final String[] argv) {
        ArrayList<Jmeno> ar = new ArrayList<Jmeno>();
        ar.add(new Jmeno("Premysl", "Prvni"));
        ar.add(new Jmeno("Rudolf", "Druhy"));
        ar.add(new Jmeno("Vaclav", "Treti"));
        ar.add(new Jmeno("Karel", "Ctvrty"));
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
    }
}


