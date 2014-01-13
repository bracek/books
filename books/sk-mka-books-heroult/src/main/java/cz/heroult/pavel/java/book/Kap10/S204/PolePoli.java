package cz.heroult.pavel.java.book.Kap10.S204;

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
class PraceSPolem {

    public static void tiskniPole(final int[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.print(p[i][j] + ", ");
            }
            System.out.print("\b\b \n");
        }
    }

    public static void nastavATiskniRadku(final int[] r,
final  int h) {
        for (int i = 0; i < r.length; i++) {
            r[i] = i + h;
            System.out.print(r[i] + ", ");
        }
        System.out.print("\b\b \n");
    }
}

public class PolePoli {

    public static void main(final String[] args) {
        int[][] pole1 = {{4, 3, 2, 1}, {1, 2, 3, 4}};
        int[][] pole2 = {{1}, {2, 3}, {4, 5, 6}};
        PraceSPolem.tiskniPole(pole1);
        PraceSPolem.tiskniPole(pole2);
        PraceSPolem.nastavATiskniRadku(pole1[0], 5);
    }
}

