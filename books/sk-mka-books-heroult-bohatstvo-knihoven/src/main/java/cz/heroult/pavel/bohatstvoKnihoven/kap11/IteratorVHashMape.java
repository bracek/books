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


class Vaha {
  double vaha;
  Vaha(double vaha) { this.vaha = vaha; }

  public String toString() {
    return "" + vaha;
  }

  public boolean equals(final Object o) {
    if (o == this)
      return true;
    if (o instanceof Vaha == false)
      return false;
    boolean stejnaVaha = (vaha == ((Vaha) o).vaha);
    return stejnaVaha;
  }

  public int hashCode() {
    return (int) vaha;
  }
}
public class IteratorVHashMape {
  public static void main(final String[] args) {
    HashMap<String, Vaha> hm = new HashMap<String, Vaha>();
    hm.put("Pavel", new Vaha(85));
    hm.put("Venca", new Vaha(105));
    hm.put("Karel", new Vaha(70));
    System.out.println("Mapa: " + hm);

    // iterator pres klice
    System.out.print("Klice: ");
    for (Iterator<String> it = hm.keySet().iterator();  it.hasNext(); ) {
      System.out.print(it.next() + ", ");
    }
    System.out.println();
    for (String jmeno: hm.keySet()) {
      System.out.print(jmeno + ", ");
    }
    System.out.println();
 
    // iterator pres hodnoty
    System.out.print("Hodnoty: ");
    for (Iterator<Vaha> it = hm.values().iterator();  it.hasNext(); ) {
      System.out.print(it.next() + ", ");
    }
    System.out.println();
    for (Vaha va: hm.values()) {
      System.out.print(va.vaha + ", ");
    }
    System.out.println();

    // iterator pres dvojice
    System.out.print("Dvojice: ");
    for (Iterator<Map.Entry<String, Vaha>> it = hm.entrySet().iterator();  it.hasNext(); ) {
      Map.Entry<String, Vaha> e = it.next();
      System.out.print(e.getKey() + "=" + e.getValue() + ", ");
    }
    System.out.println();

    for (Map.Entry<String, Vaha> e: hm.entrySet()) {
      System.out.print(e.getKey() + "=" + e.getValue() + ", ");
    }
    System.out.println();

    System.out.print("Vsichni ztloustli: ");
    for (Map.Entry<String, Vaha> e: hm.entrySet()) {
      double d = e.getValue().vaha;
      Vaha v = new Vaha(d + 10);
      System.out.print(e.getKey() + "=" + e.setValue(v) + "->" + e.getValue() + ", ");
    }
    System.out.println();
    System.out.println("Mapa: " + hm);
  }
}
