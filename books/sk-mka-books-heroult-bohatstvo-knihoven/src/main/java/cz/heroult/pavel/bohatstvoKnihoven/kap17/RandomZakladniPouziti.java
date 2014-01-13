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

public class RandomZakladniPouziti {
  public static void main(final String[] args) {
    Random r1 = new Random();
    Random r2 = new Random();
    Random r3 = new Random(123);
    Random r4 = new Random(123);
    System.out.println("r1 = " + r1.nextInt());
    System.out.println("r2 = " + r2.nextInt());
    System.out.println("r3 = " + r3.nextInt());
    System.out.println("r4 = " + r4.nextInt());
  }
}

