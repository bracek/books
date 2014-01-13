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

public class RandomMeze {
  public static void main(final String[] args) {
    Random r = new Random(123);

    for (int i = 0;  i < 15;  i++)
      System.out.print(r.nextInt(10) + ", ");
    System.out.println();

    for (int i = 0;  i < 5;  i++)
      System.out.print(r.nextFloat() + ", ");
    System.out.println();

    for (int i = 0;  i < 5;  i++)
      System.out.print(r.nextBoolean() + ", ");
    System.out.println();
  }
}

