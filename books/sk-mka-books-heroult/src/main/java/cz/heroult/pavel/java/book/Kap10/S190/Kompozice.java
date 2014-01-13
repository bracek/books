package cz.heroult.pavel.java.book.Kap10.S190;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                  U�ebnice jazyka Java                       //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       CTI_ME.TXT                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2000                      // 
//                                                             //
/////////////////////////////////////////////////////////////////
class Datum {

    public int den,  mesic,  rok;

    public Datum(final int den,
final  int mesic,
final  int rok) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }

    public Datum(final Datum d) {
        this(d.den, d.mesic, d.rok);
    }

    public String toString() {
        return "" + den + "." + mesic + "." + rok;
    }
}

class Zamestnanec {

    public String jmeno;
    public Datum narozeni,  nastup;

    public Zamestnanec(final String jmeno,
final  Datum narozeni,
final  Datum nastup) {
        this.jmeno = new String(jmeno);
        this.narozeni = new Datum(narozeni);
        this.nastup = new Datum(nastup);
    }

    public String toString() {
        String s;
        s = jmeno + ", narozen: " + narozeni.toString();
        s = s + "\nnastoupil: " + nastup.toString();
        return s;
    }
}

public class Kompozice {

    public static void main(final String[] argv) {
        Datum narozeni = new Datum(21, 5, 1960);
//    Datum nastup = new Datum(1, 10, 1990);
//    Zamestnanec z = new Zamestnanec("Josef Novak", narozeni, nastup);
        Zamestnanec z = new Zamestnanec("Josef Novak", narozeni, new Datum(1, 10, 1990));
        System.out.println(z.toString());
    }
}

