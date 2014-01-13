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

class Citac {

    int hodnota;

    Citac() {
        hodnota = 0;
    }

    void plusJedna() {
        hodnota++;
    }

    @Override
    public int hashCode() {
        return hodnota;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Citac == false) {
            return false;
        }

        boolean stejnaHodnota = (hodnota == ((Citac) o).hodnota);
        return stejnaHodnota;
    }
}

public class ZmenaHesovacihoKodu {

    public static void main(final String[] args) {
        HashSet<Citac> hs = new HashSet<Citac>();
        Citac c = new Citac();
        Citac pom = new Citac();
        System.out.println("citace jsou si rovny: " + c.equals(pom));

        hs.add(c);
        System.out.println(hs);
        System.out.println("obsahuje 0: " + hs.contains(pom));
        pom.plusJedna();
        System.out.println(hs);
        System.out.println("obsahuje 0: " + hs.contains(pom));
    }
}
