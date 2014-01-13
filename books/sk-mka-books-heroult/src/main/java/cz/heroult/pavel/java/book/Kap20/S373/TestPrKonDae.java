package cz.heroult.pavel.java.book.Kap20.S373;

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
public class TestPrKonDae {

    public static void main(final String[] args) {
        CteniDae s1 = new CteniDae("data10.txt");
        ProducentDae vlPr1 = new ProducentDae(s1);
        KonzumentDae vlKon1 = new KonzumentDae(s1);
        vlKon1.start();
        vlPr1.setDaemon(true);
        vlPr1.start();
    }
}
