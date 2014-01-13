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

public class KontrolaAtributuVMape {
  public static void main(final String args[]) {
    String[] key = {"pozadi", "popredi", "ramecek"};
    HashSet<String> atributy = new HashSet<String>(Arrays.asList(key));

    HashMap<String, String> nastaveni = new HashMap<String, String>();
    nastaveni.put("pozadi", "bila");
    // neznamy atribut
    nastaveni.put("text", "zelena");

    System.out.println("Seznam atributu:    " + atributy);
    System.out.println("Aktualni nastaveni: " + nastaveni);

    HashSet<String> chybi = new HashSet<String>(atributy);
    chybi.removeAll(nastaveni.keySet());
    System.out.println("Atributy chybi:     " + chybi);

    HashSet<String> navic = new HashSet<String>(nastaveni.keySet());
    navic.removeAll(atributy);
    System.out.println("Atributy navic:     " + navic);

    HashSet<String> shodne = new HashSet<String>(nastaveni.keySet());
    shodne.retainAll(atributy);
    System.out.println("Atributy shodne:    " + shodne);
  }
}
