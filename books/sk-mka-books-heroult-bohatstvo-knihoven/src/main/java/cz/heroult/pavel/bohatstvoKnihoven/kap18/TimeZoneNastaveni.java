package cz.heroult.pavel.bohatstvoKnihoven.kap18;

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

public class TimeZoneNastaveni {
  public static void main(final String[] args) {
    TimeZone tz = TimeZone.getDefault();
    System.out.println(tz.getDisplayName());
    System.out.println(tz.getID());

    tz = TimeZone.getTimeZone("Europe/Prague");
    System.out.println(tz.getDisplayName());
    tz = TimeZone.getTimeZone("Europe/Bratislava");
    System.out.println(tz.getDisplayName());
  }
}
