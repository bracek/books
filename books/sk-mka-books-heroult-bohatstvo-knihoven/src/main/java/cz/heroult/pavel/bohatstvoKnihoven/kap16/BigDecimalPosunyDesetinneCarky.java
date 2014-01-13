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

public class BigDecimalPosunyDesetinneCarky {
  public static void main(final String[] args) {
    BigDecimal bd, bdl5;
    bd = new BigDecimal(BigInteger.ONE, 5);
    System.out.println("bd      = " + bd);
    bdl5 = bd.movePointLeft(5);
    System.out.println("bd <- 5 = " + bdl5);
    System.out.println("bdl5 sc = " + bdl5.scale());
    System.out.println("bd -> 5 = " + bd.movePointRight(5));
    System.out.println("bdr5 sc = " + bd.movePointRight(5).scale());
  }
}

