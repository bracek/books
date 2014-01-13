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

public class CalendarPocatecniDenTydne {
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();

    int prvni = cal.getFirstDayOfWeek();
    System.out.println("prvni = " + prvni);

    if (prvni == Calendar.SUNDAY)
      System.out.println("ned�le");
    if (prvni == Calendar.MONDAY)
      System.out.println("pond�l�");
  }
}
