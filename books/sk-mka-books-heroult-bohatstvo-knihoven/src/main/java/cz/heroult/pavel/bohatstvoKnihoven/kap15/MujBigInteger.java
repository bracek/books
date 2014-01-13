package cz.heroult.pavel.bohatstvoKnihoven.kap15;

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

public class MujBigInteger {
  public static void main(final String[] args) {
    BigInteger bi = new BigInteger("-123456");
    System.out.println(bi);
    System.out.println(bi.toString(16));
    System.out.println(bi.abs());
    System.out.println(bi.add(new BigInteger("123455")));

    String s = "1";
    for (int i = 1;  i < 50;  i++) {
      s += "0";
    }

    bi = new BigInteger(s);
    System.out.println(bi);
    System.out.println(bi.bitLength());
    bi = new BigInteger("13");
    System.out.println(bi);
    System.out.println(bi.bitLength());
    System.out.println(bi.getLowestSetBit());
    System.out.println(bi.isProbablePrime(10));
  }
}
