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

public class RandomGaussMeze {
  static int pocet = 1000000;

  public static void main(final String[] args) {
    if (args.length == 1)
      pocet = Integer.parseInt(args[0]);

    Random r = new Random(0);
    double d;
    double max = Double.MIN_VALUE;
    double min = Double.MAX_VALUE;
    for (int i = 0;  i < pocet;  i++) {
      d = r.nextGaussian();
      if (d > max)
        max = d;
      if (d < min)
        min = d;  
    }

    System.out.println("Pokusu: " + pocet);
    System.out.println("Min: " + min);
    System.out.println("Max: +" + max);
  }
}

