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

public class BigDecimalZaokrouleniNaStovky {
  public static void main(final String[] args) {
    BigDecimal bd = new BigDecimal("1234.56");
    System.out.println("bd = " + bd);
    bd = bd.movePointLeft(2);
    bd = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
    bd = bd.movePointRight(2);
    System.out.println("bd = " + bd);
  }
}

