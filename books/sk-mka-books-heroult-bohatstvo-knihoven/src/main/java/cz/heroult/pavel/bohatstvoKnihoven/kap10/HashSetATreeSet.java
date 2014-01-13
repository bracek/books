package cz.heroult.pavel.bohatstvoKnihoven.kap10;

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

public class HashSetATreeSet {

  public static void naplneniATisk(final Set<String> st) {
    st.add("treti");
    st.add("prvni");
    st.add("druhy");
    // pokus o vlozeni stejneho prvku
    if (st.add("treti") == false) {
      System.out.println("'treti' podruhe nevlozen");
    }
    System.out.println(st.size() + " " + st);
    for (String s: st) {
      System.out.print(s + ", ");
    }
    if (st.contains("treti") == true) {
      System.out.println("\n'treti' je v mnozine");
    }
    st.remove("treti");
    System.out.println(st);
    st.clear();
  }

  public static void main(final String[] args) {
    System.out.println("HashSet:");
    naplneniATisk(new HashSet<String>());
    System.out.println("TreeSet:");
    naplneniATisk(new TreeSet<String>());
  }
}
