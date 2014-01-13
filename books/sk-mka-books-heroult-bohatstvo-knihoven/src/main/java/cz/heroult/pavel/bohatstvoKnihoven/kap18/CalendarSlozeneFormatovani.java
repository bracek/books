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

public class CalendarSlozeneFormatovani {
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();

    int den = cal.get(Calendar.DAY_OF_MONTH);
    SimpleDateFormat sdfD = new SimpleDateFormat("MMMM");
    String dlouhyMesic = sdfD.format(cal.getTime());
    int rok = cal.get(Calendar.YEAR);
    System.out.println("Dnes je: " + den + ". " + dlouhyMesic + " " + rok);

    SimpleDateFormat sdfDatum = new SimpleDateFormat("d. MMMM yyyy");
    String datum = sdfDatum.format(cal.getTime());
    System.out.println("Dnes je: " + datum);
  }
}
