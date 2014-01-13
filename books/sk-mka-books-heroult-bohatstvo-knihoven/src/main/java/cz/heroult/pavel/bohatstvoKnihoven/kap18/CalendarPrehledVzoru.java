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

public class CalendarPrehledVzoru {
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();

    SimpleDateFormat sdfD = new SimpleDateFormat("MMMM");
    String dlouhyMesic = sdfD.format(cal.getTime());
    System.out.println("MMMM: " + dlouhyMesic);

    SimpleDateFormat sdfK = new SimpleDateFormat("MMM");
    String kratkyMesic = sdfK.format(cal.getTime());
    System.out.println("MMM:  " + kratkyMesic);

    SimpleDateFormat sdfM = new SimpleDateFormat("M");
    String mesicCislem = sdfM.format(cal.getTime());
    System.out.println("M:    " + mesicCislem);

    SimpleDateFormat sdfDD = new SimpleDateFormat("EEEE");
    String dlouhyDen = sdfDD.format(cal.getTime());
    System.out.println("EEEE: " + dlouhyDen);

    SimpleDateFormat sdfKD = new SimpleDateFormat("E");
    String kratkyDen = sdfKD.format(cal.getTime());
    System.out.println("E:    " + kratkyDen);

    SimpleDateFormat sdfAMPM = new SimpleDateFormat("a");
    String ampm = sdfAMPM.format(cal.getTime());
    System.out.println("AM_PM: " + ampm);
  }
}
