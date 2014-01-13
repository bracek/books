package cz.heroult.pavel.java.book.Kap10.S194;

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
public class TestBankomatu {

    public static void main(final String[] args) {
        Bankomat b = new Bankomat();
        // b.penize = 5000;    // nelze - autorizovany pristup
        b.setPenize(1000);
        System.out.println("vybrano: " + b.getPenize(200));
    }
}
