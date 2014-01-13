package cz.heroult.pavel.bohatstvoKnihoven.kap13;

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

public class CetnostPouzitiVMape {
  public static void main(final String[] args) {
    String[] pole = {"A", "B", "C", "D", "E", "F"};
    LinkedHashMap<String, Integer> pristup = 
       new LinkedHashMap<String, Integer>(16, 0.75F, true);
    for (int i = 0; i < pole.length;  i++) {
      pristup.put(pole[i], new Integer(0));
    }
    System.out.println("Po vytvoreni: " + pristup);

    Random r = new Random();
    for (int i = 0; i < 20;  i++) {
      String klic = "" + (char)(r.nextInt(6) + 'A');
      System.out.print(klic + " ");
      Integer hodnota = pristup.get(klic);
      pristup.put(klic, new Integer(hodnota.intValue() + 1));
    }
    System.out.println();
    System.out.println("Po pristupu:  " + pristup);
  }
}
