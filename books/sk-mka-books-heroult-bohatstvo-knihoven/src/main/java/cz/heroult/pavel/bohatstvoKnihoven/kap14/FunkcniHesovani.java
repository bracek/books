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

class NaseOvocie {

    int cena;
    String typ;

    NaseOvocie(int cena) {
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
    /*
    // prehlednejsi zpusob
    public boolean equals(final Object o) {
    if (o == this)
    return true;
    if (o instanceof NaseOvocie == false)
    return false;

    boolean stejnaCena = (cena == ((NaseOvocie) o).cena);
    boolean stejnyTyp = (typ == ((NaseOvocie) o).typ);
    return (stejnaCena && stejnyTyp);
    }
     */

    // rychlejsi zpusob
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof NaseOvocie == false) {
            return false;
        }

        if (cena != ((NaseOvocie) o).cena) {
            return false;
        }

        return (typ == ((NaseOvocie) o).typ);
    }
}

public class FunkcniHesovani {

    public static void main(final String[] args) {
        HashSet<NaseOvocie> NaseOvocieSet = new HashSet<NaseOvocie>();
        for (int i = 6; i <= 8; i++) {
            NaseOvocieSet.add(new NaseOvocie(i));
        }
        System.out.println("NaseOvocieSet: " + NaseOvocieSet);
        System.out.println("obsahuje 7: " + NaseOvocieSet.contains(new NaseOvocie(7)));
    }
}
