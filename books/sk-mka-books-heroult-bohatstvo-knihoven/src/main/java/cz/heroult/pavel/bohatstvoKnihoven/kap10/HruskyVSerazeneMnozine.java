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

class MyHruska implements Comparable<MyHruska> {
  int cena;
  MyHruska(int cena) { this.cena = cena; }
  public String toString() { return "" + cena; }

   public boolean equals(final Object o) {
     if (o == this)
       return true;
     if (o instanceof MyHruska == false)
       return false;
     boolean stejnaCena = (cena == ((MyHruska) o).cena);
     return stejnaCena;
   }

   public int hashCode() {
    return cena;
  }

  public int compareTo(final MyHruska h) {
    if (cena > h.cena)
      return (+1);
    else if (cena == h.cena)
      return (0);
    else
      return (-1);
  }
}

public class HruskyVSerazeneMnozine {
  public static void main(final String[] args) {
    SortedSet<MyHruska> st = new TreeSet<MyHruska>();

    for (int i = 29;  i >= 20 ;  i--) {
      st.add(new MyHruska(i));
    }
    System.out.println("Cely kosik: " + st);
    System.out.println("Nejlevnejsi MyHruska: " +
                       st.first());
    System.out.println("Nejdrazsi MyHruska: " +
                       st.last());

//    TreeSet<MyHruska> pom = st.subSet(new MyHruska(23),
    SortedSet<MyHruska> pom = st.subSet(new MyHruska(23),
                            new MyHruska(26));
    System.out.println("Od 23 do 26: " + pom.size() + " " + pom);
    pom = st.headSet(new MyHruska(25));
    System.out.println("Pod 25: " + pom.size() + " " + pom);
    pom = st.tailSet(new MyHruska(25));
    System.out.println("Nad 25: " + pom.size() + " " + pom);
  }
}
