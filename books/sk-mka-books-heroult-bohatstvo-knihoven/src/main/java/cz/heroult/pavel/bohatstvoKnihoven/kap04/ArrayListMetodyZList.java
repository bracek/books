package cz.heroult.pavel.bohatstvoKnihoven.kap04;

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

public class ArrayListMetodyZList {
  public static void tiskni(final String jmeno,
final  ArrayList<String> ar) {
    int vel = ar.size();
    System.out.print(jmeno + " (" + vel + ") : ");
    for (int i = 0;  i < vel;  i++) {
      System.out.print("[" + i + "]=" + ar.get(i) + ", ");
    }
    System.out.println();
  }

  public static void main(final String[] args) {
    System.out.println("\nVytvoreni seznamu");
    ArrayList<String> ar = new ArrayList<String>();
    ar.add("prvni");
    ar.add("druhy");
    ar.add("prvni");
    tiskni("ar", ar);

    System.out.println("\nPridavani, zmena a ubirani prvku");
    ar.add(2, "treti");
    tiskni("ar", ar);
    ar.set(1, "DRUHY");
    tiskni("ar", ar);
    ar.remove(2);
    tiskni("ar", ar);

    System.out.println("\nHledani prvku");
    ar.add("ctvrty");
    tiskni("ar", ar);
    System.out.println("'ctvrty' ma index: "
                      + ar.indexOf("ctvrty"));
    System.out.println("posledni 'prvni' ma index: "
                      + ar.lastIndexOf("prvni"));
  }
}
