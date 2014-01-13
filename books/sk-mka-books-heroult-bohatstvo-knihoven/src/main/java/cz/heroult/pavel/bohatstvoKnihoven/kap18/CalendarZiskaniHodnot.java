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

public class CalendarZiskaniHodnot {
  public static void p(final String tisk) {
    System.out.println(tisk);
  }
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();
    p("ERA: " + cal.get(Calendar.ERA));
    p("YEAR: " + cal.get(Calendar.YEAR));
    p("MONTH: " + cal.get(Calendar.MONTH));
    p("DATE: " + cal.get(Calendar.DATE));
    p("DAY_OF_MONTH: " + cal.get(Calendar.DAY_OF_MONTH));
    p("DAY_OF_YEAR: " + cal.get(Calendar.DAY_OF_YEAR));
    p("DAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK));
    p("AM_PM: " + cal.get(Calendar.AM_PM));
    p("HOUR: " + cal.get(Calendar.HOUR));
    p("HOUR_OF_DAY: " + cal.get(Calendar.HOUR_OF_DAY));
    p("MINUTE: " + cal.get(Calendar.MINUTE));
    p("SECOND: " + cal.get(Calendar.SECOND));
    p("MILLISECOND: " + cal.get(Calendar.MILLISECOND));
  }
}
