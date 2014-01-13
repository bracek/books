package cz.heroult.pavel.java.book.Kap10.S199;

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
class Nasobeni {

    public static int nasobDvema(final int i) {
        return i * 2;
    }

    public int nasobTremi(final int i) {
        return i * 3;
    }
}

public class Hodnotou {

    public static void main(final String[] args) {
        int prvni = 5, druhy = 7;

        Nasobeni n = new Nasobeni();
        prvni = Nasobeni.nasobDvema(prvni);
        druhy = n.nasobTremi(druhy);
        System.out.println("prvni: " + prvni + ", druhy: " + druhy);
    }
}
