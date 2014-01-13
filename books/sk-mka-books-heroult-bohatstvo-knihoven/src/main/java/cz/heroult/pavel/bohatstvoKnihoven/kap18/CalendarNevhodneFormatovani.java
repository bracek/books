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

public class CalendarNevhodneFormatovani {
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();
    cal.set(2003, Calendar.JUNE, 14);

    String den = "";
    switch (cal.get(Calendar.DAY_OF_WEEK)) {
      case Calendar.MONDAY:    den = "Pond�l�"; break;
      case Calendar.TUESDAY:   den = "�ter�";   break;
      case Calendar.WEDNESDAY: den = "St�eda";  break;
      case Calendar.THURSDAY:  den = "�tvrtek"; break;
      case Calendar.FRIDAY:    den = "P�tek";   break;
      case Calendar.SATURDAY:  den = "Sobota";  break;
      case Calendar.SUNDAY:    den = "Ned�le";  break;
    }
    System.out.println("DAY_OF_WEEK: " + den);
  }
}
