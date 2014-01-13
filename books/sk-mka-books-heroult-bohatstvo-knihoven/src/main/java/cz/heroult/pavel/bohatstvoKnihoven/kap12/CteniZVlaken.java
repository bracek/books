package cz.heroult.pavel.bohatstvoKnihoven.kap12;

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

public class CteniZVlaken extends Thread {
  static ArrayList<Integer> kol;  // pouze jedna kolekce

  CteniZVlaken(String jmeno) {
    super(jmeno);
  }

  public void run() {
    for (Integer i : kol) {
      System.out.println(getName() + ": " + i);
      Thread.yield();
    }
  }

  public static void main(final String[] args) {
    kol = new ArrayList<Integer>();
    for (int i = 1;  i <= 4;  i++) {
      kol.add(new Integer(i));
    }

    new CteniZVlaken("1. vlakno").start();
    new CteniZVlaken("2. vlakno").start();
  }
}
