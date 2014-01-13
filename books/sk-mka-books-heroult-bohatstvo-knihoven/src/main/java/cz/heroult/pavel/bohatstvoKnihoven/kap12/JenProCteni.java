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

public class JenProCteni {
  public static void main(final String[] args) {
    ArrayList<Integer> pole = new ArrayList<Integer>();
    pole.add(new Integer(5));
    List<Integer> readOnlyPole = Collections.unmodifiableList(pole);
    pole = null;   // pro jistotu
    System.out.println(readOnlyPole.get(0));
    readOnlyPole.add(new Integer(5));
  }
}
