package cz.heroult.pavel.bohatstvoKnihoven.kap11;

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

public class NastaveniVMape {
  private static String[] key = {"pozadi", "popredi", "ramecek"};
  private static String[] hodDef = {"bila", "cerna", "modra"};
  private static String[] hodUziv = {null, "modra", "cervena"};

  static Map<String, String> options(final String[] hodnoty) {
    Map<String, String> m = new HashMap<String, String>();
    for (int i = 0;  i < key.length;  i++) {
      if (hodnoty[i] != null) {
        m.put(key[i], hodnoty[i]);
      }
    }
    return m;
  }

  public static void main(final String args[]) {
    Map<String, String> defaultNastaveni = options(hodDef);
    Map<String, String> uzivatelNastaveni = options(hodUziv);
    Map<String, String> platneNastaveni = 
                   new HashMap<String, String>(defaultNastaveni);
    platneNastaveni.putAll(uzivatelNastaveni);
    System.out.println("Default:  " + defaultNastaveni);
    System.out.println("Uzivatel: " + uzivatelNastaveni);
    System.out.println("Platne:   " + platneNastaveni);
  }
}
