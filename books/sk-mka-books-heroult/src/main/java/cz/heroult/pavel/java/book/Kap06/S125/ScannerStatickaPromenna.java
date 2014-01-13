package cz.heroult.pavel.java.book.Kap06.S125;

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
import java.util.Scanner;

public class ScannerStatickaPromenna {

    static Scanner scanner = new Scanner(System.in);

    public static int nactiCislo(final int poradi) {
        System.out.print("Zadej " + poradi + ". cislo: ");
        int i = scanner.nextInt();
        return i;
    }

    public static void main(final String[] args) {
        int i1 = nactiCislo(1);
        int i2 = nactiCislo(2);
        int i3 = nactiCislo(3);
        System.out.println("Soucet je: " + (i1 + i2 + i3));
    }
}
