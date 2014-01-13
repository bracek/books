package cz.heroult.pavel.bohatstvoKnihoven.kap17;

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

import java.util.*;

public class RandomBajty {
  public static void main(final String[] args) {
    Random r = new Random(123);
    byte[] b = new byte[10];
    r.nextBytes(b);
    for (int i = 0;  i < b.length;  i++) {
      System.out.print(b[i] + ", ");
    }
  }
}

