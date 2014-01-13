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

public class BigDecimalZpusobyZaokrouhlovani {
  public static void main(final String[] args) {
    BigDecimal bd = new BigDecimal("-123.15");
    System.out.println("scale   = " + bd.scale());
    System.out.println("hodnota = " + bd.unscaledValue());
    System.out.println("bd                  = " + bd);
    System.out.println("bd ROUND_CEILING    = " + bd.setScale(1, BigDecimal.ROUND_CEILING));
    System.out.println("bd ROUND_DOWN       = " + bd.setScale(1, BigDecimal.ROUND_DOWN));
    System.out.println("bd ROUND_FLOOR      = " + bd.setScale(1, BigDecimal.ROUND_FLOOR));
    System.out.println("bd ROUND_HALF_DOWN  = " + bd.setScale(1, BigDecimal.ROUND_HALF_DOWN));
    System.out.println("bd ROUND_HALF_EVEN  = " + bd.setScale(1, BigDecimal.ROUND_HALF_EVEN));
    System.out.println("bd ROUND_HALF_UP    = " + bd.setScale(1, BigDecimal.ROUND_HALF_UP));
    System.out.println("bd ROUND_UP         = " + bd.setScale(1, BigDecimal.ROUND_UP));
    System.out.println("bd ROUND_UNNECESSARY= " + bd.setScale(1, BigDecimal.ROUND_UNNECESSARY));
  }
}

