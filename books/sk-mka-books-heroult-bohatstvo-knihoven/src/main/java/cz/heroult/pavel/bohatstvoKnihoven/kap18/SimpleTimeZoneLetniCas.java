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

public class SimpleTimeZoneLetniCas {
  public static void main(final String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("EE d. MM. yyyy");
    GregorianCalendar gc = new GregorianCalendar(2003, Calendar.JANUARY, 1);
    boolean zmena = true;

    for (int i = 1;  i < 365;  i++) {
      TimeZone tz = gc.getTimeZone();
      if (tz.inDaylightTime(gc.getTime()) == zmena) {
        GregorianCalendar gcv = (GregorianCalendar) gc.clone();
        gcv.add(Calendar.DAY_OF_YEAR, -1);  // predchozi den
        System.out.println(sdf.format(gcv.getTime()));
        zmena = !zmena;
      }
      gc.add(Calendar.DAY_OF_YEAR, 1);
    }
  }
}
