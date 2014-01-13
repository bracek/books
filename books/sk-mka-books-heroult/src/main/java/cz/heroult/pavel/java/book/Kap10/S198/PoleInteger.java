package cz.heroult.pavel.java.book.Kap10.S198;

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
import java.util.Arrays;

public class PoleInteger {

    public static void main(final String[] args) {
        Integer[] pole = new Integer[10];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = new Integer(i + 1);
        }
        System.out.println(Arrays.toString(pole));
        Integer objI = pole[2];
        int i = objI.intValue();
        int j = pole[2];
        System.out.println("i = " + i + ", j = " + j);
        pole[3] = new Integer(78);
        pole[4] = 34;
        System.out.println(Arrays.toString(pole));
    }
}
