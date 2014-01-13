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

public class StejneMapy {
  static HashMap<String, Integer> vytvoreniANaplneniMapy() {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    for (int i = 1;  i <= 3;  i++) {
      String jmeno = "Robot" + i;
      hm.put(jmeno, new Integer(50 + i));
    }
    return hm;
  }
 
  public static void main(final String[] args) {
    HashMap<String, Integer> hmOrig = vytvoreniANaplneniMapy();
    HashMap<String, Integer> hmStejna = vytvoreniANaplneniMapy();

    HashMap<String, Integer> hmMensi = vytvoreniANaplneniMapy();
    Set kl = hmMensi.keySet();
    kl.remove("Robot1");

    HashMap<String, Integer> hmVetsi = vytvoreniANaplneniMapy();
    hmVetsi.put("Robot5", new Integer(55)); 

    System.out.println("hmOrig:    " + hmOrig);

    boolean b;
    b = hmStejna.entrySet().equals(hmOrig.entrySet());
    System.out.println("hmStejna:  " + hmStejna);
    System.out.println("hmOrig obsahuje stejne prvky jako hmStejna: " + b);

    b = hmMensi.entrySet().equals(hmOrig.entrySet());
    System.out.println("hmMensi:   " + hmMensi);
    System.out.println("hmOrig obsahuje stejne prvky jako hmMensi: " + b);

    b = hmVetsi.entrySet().equals(hmOrig.entrySet());
    System.out.println("hmVetsi:   " + hmVetsi);
    System.out.println("hmOrig obsahuje stejne prvky jako hmVetsi: " + b);
  }
}
