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

public class BigDecimalPresnaCisla {
  public static void main(final String[] args) {
    BigDecimal bd = new BigDecimal("0.1");
    BigDecimal plus = new BigDecimal("0.1");
    double d = 0.1;
    for (int i = 1;  i < 11;  i++) {
      System.out.print("bd = " + bd);
      System.out.println(", d = " + d);
      bd = bd.add(plus);
      d += 0.1;
    }
  }
}

