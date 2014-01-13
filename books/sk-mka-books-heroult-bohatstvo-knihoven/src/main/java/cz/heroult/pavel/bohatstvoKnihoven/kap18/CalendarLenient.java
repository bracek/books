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

public class CalendarLenient {
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();
    cal.setLenient(true);
    cal.set(2003, Calendar.JANUARY, 32);
    System.out.print(cal.get(Calendar.DAY_OF_MONTH) + ".");
    System.out.println((cal.get(Calendar.MONTH) + 1) + ".");
    cal.setLenient(false);
    cal.set(2003, Calendar.JANUARY, 32);
    System.out.print(cal.get(Calendar.DAY_OF_MONTH) + ".");
  }
}
