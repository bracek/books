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

public class CalendarMaximaAMinima {
  public static void main(final String[] args) {
    Calendar cal = new GregorianCalendar(2003, Calendar.FEBRUARY, 23);

    int amax = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    int max = cal.getMaximum(Calendar.DAY_OF_MONTH);
    System.out.println("amax = " + amax + ", max = " + max);

    int ymin = cal.getMinimum(Calendar.YEAR);
    int ymax = cal.getActualMaximum(Calendar.YEAR);
    System.out.println("ymin = " + ymin + ", ymax = " + ymax);
  }
}
