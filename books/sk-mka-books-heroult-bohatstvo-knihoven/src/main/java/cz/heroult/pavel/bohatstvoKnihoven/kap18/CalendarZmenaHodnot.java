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

public class CalendarZmenaHodnot {
  public static void main(final String[] args) {
    Calendar cal = new GregorianCalendar(2003, Calendar.MARCH, 31);

    cal.setLenient(true);
    SimpleDateFormat sdfDatum = new SimpleDateFormat("d. MMMM yyyy");
    String datum = sdfDatum.format(cal.getTime());
    System.out.println("pred zmenou: " + datum);

    cal.set(Calendar.MONTH, Calendar.APRIL);
    datum = sdfDatum.format(cal.getTime());
    System.out.println("po zmene:    " + datum);

    cal.setLenient(false);
    cal.set(Calendar.MONTH, Calendar.APRIL);
    datum = sdfDatum.format(cal.getTime());
    System.out.println("po zmene (false): " + datum);
  }
}
