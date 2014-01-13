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
import java.text.*;

public class CalendarKumulativniZmenaNizsiPolozky {
  public static void main(final String[] args) {
    Calendar cal1 = new GregorianCalendar(2003, Calendar.JANUARY, 31);
    Calendar cal2 = (Calendar) cal1.clone();

    SimpleDateFormat s = new SimpleDateFormat("d. MMMM yyyy");
    System.out.println(s.format(cal1.getTime()));
    cal1.add(Calendar.MONTH, 1);
    System.out.println(s.format(cal1.getTime()));
    cal1.add(Calendar.MONTH, 1);
    System.out.println(s.format(cal1.getTime()));
    cal2.add(Calendar.MONTH, 2);
    System.out.println(s.format(cal2.getTime()));
  }
}
