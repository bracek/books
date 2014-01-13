package cz.heroult.pavel.bohatstvoKnihoven.kap16;

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
import java.math.*;

public class BigDecimalExtremniPresnost {

    public static void main(final String[] args) {
        BigDecimal pi;
        pi = new BigDecimal("3.14159265358979323846264338327");
        BigDecimal pi2 = pi.multiply(pi);
        BigDecimal pi1 = pi2.divide(pi, BigDecimal.ROUND_HALF_UP);
        System.out.println("Pi      = " + pi);
        System.out.println("Pi ** 2 = " + pi2);
        System.out.println("Pi      = " + pi1);
    }
}

