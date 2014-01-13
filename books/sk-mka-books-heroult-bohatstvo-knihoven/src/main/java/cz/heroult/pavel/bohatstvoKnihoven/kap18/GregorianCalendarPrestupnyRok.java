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

public class GregorianCalendarPrestupnyRok {
  public static void main(final String[] args) {
    GregorianCalendar gc = new GregorianCalendar();

    System.out.println("1600: " + gc.isLeapYear(1600));
    System.out.println("1700: " + gc.isLeapYear(1700));
    System.out.println("1800: " + gc.isLeapYear(1800));
    System.out.println("1900: " + gc.isLeapYear(1900));
    System.out.println("2000: " + gc.isLeapYear(2000));
    System.out.println("2003: " + gc.isLeapYear(2003));
  }
}
