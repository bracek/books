package cz.heroult.pavel.bohatstvoKnihoven.kap14;

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

class MyOvoce {
  int cena;
  String typ;
  MyOvoce(int cena) {
    this.cena = cena;
    this.typ = "jablko";   // pro jednoduchost
  }

    @Override
  public String toString() {
    return typ + ":" + cena + " Kc";
  }

    @Override
  public int hashCode() {
    return cena;
  }

    @Override
  public boolean equals(final Object o) {
    if (o == this)
      return true;
    if (o instanceof MyOvoce == false)
      return false;

    boolean stejnaCena = (cena == ((MyOvoce) o).cena);
    boolean stejnyTyp = (typ == ((MyOvoce) o).typ);
    return (stejnaCena && stejnyTyp);
  }
}

public class StejneHesovaciKody {
  public static void main(final String[] args) {
    HashSet<MyOvoce> MyOvoceSet = new HashSet<MyOvoce>();
    MyOvoceSet.add(new MyOvoce(7));
    MyOvoceSet.add(new MyOvoce(7));
    System.out.println("MyOvoceSet: " + MyOvoceSet);
    System.out.println("obsahuje 7: "
             + MyOvoceSet.contains(new MyOvoce(7)));
    MyOvoce hruska = new MyOvoce(7);
    hruska.typ = "hruska";
    MyOvoceSet.add(hruska);
    System.out.println("MyOvoceSet: " + MyOvoceSet);
    System.out.println("obsahuje 7: "
             + MyOvoceSet.contains(new MyOvoce(7)));
  }
}
