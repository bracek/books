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

public class IteratorZmenaKolekce {
  public static void main(final String[] args) {
    ArrayList<Integer> kont = new ArrayList<Integer>();
    for (int i = 0;  i < 10;  i++) {
      kont.add(new Integer(i));
    }

    Iterator<Integer> it = kont.iterator();
    System.out.println(it.next());
    kont.add(new Integer(20));
    // zde vyhodi vyjimku
    System.out.println(it.next());
  }
}
