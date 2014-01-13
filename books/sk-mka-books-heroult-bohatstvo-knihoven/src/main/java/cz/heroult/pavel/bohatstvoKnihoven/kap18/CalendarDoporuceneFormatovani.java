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

public class CalendarDoporuceneFormatovani {
  public static void main(final String[] args) {
    Calendar cal = Calendar.getInstance();

    SimpleDateFormat sdfEra = new SimpleDateFormat("G");
    String era = sdfEra.format(cal.getTime());
    System.out.println("ERA: " + era);

    SimpleDateFormat sdfEraAngl = new SimpleDateFormat("G", new Locale("en", "US"));
    String eraA = sdfEraAngl.format(cal.getTime());
    System.out.println("ERA (angl.): " + eraA);

    SimpleDateFormat sdfEraCes = new SimpleDateFormat("G", new Locale("cs", "CZ"));
    String eraC = sdfEraCes.format(cal.getTime());
    System.out.println("ERA (cesky): " + eraC);
  }
}
