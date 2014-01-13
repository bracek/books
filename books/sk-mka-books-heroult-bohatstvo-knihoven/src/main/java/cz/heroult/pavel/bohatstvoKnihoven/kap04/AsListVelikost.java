package cz.heroult.pavel.bohatstvoKnihoven.kap04;


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

public class AsListVelikost {
  public static void main(final String[] args) {
    String[] pole = {"1", "2", "3"};
    List<String> seznam = Arrays.asList(pole);
    System.out.println(seznam);
//    seznam.remove(0);
//    seznam.add("5");
    pole[1] = "osm";
    System.out.println(seznam);
  }
}
