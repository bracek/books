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

public class CalendarKumulativniZmenaVyssichPolozek {
  public static void main(final String[] args) {
    Calendar cal = new GregorianCalendar(2002, Calendar.DECEMBER, 31, 23, 59, 59);

    SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss, d. MMMM yyyy");
    System.out.println(s.format(cal.getTime()));
    cal.add(Calendar.SECOND, 1);
    System.out.println(s.format(cal.getTime()));
  }
}
