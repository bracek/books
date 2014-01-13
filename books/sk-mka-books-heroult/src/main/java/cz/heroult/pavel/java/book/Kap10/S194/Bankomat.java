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
import java.util.*;

public class Bankomat {

    private int penize;

    private int ctiPin() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private boolean overPIN(final int pin) {
        return (pin == 1234) ? true : false;
    }

    void setPenize(int kolik) {
        Date d = new Date();
        if (kolik > 0) {
            penize += kolik;
            System.out.println(d + " vlozeno: " + kolik);
        } else {
            System.out.println(d + " podezrely vklad: " + kolik);
        }
    }

    int getPenize(int kolik) {
        Date d = new Date();
        System.out.print("Zadejte PIN: ");
        int pin = ctiPin();
        if (overPIN(pin) == true) {
            if (penize >= kolik) {
                penize -= kolik;
                System.out.println(d + " vybrano: " + kolik);
                return kolik;
            } else {
                System.out.println("Nedostatek hotovosti!");
            }
        } else {
            System.out.println(d + " PIN nesouhlasi");
        }
        return 0;
    }
}
