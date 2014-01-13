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

class CeleCislo {
  private int cislo;
  CeleCislo(int i) { this.cislo = i; }
  int getCislo() { return cislo; }
  void setCislo(int i) { this.cislo = i; }
  public String toString() { return "" + cislo; }
}

public class ArrayListVlastniTrida {
  public static void tiskni(final String jmeno,
final  List<CeleCislo> li) {
    int vel = li.size();
    System.out.print(jmeno + " (" + vel + ") : ");
    for (int i = 0;  i < vel;  i++) {
      System.out.print("[" + i + "]="
                       + li.get(i).getCislo() + ", ");
    }
    System.out.println();
  }

  public static void main(final String[] args) {
    System.out.println("Vytvoreni seznamu");
    ArrayList<CeleCislo> ar = new ArrayList<CeleCislo>();
    for (int i = 0;  i < 5;  i++) {
      ar.add(new CeleCislo(i + 10));
    }
    tiskni("ar", ar);
    System.out.println("Tisk celeho seznamu: " + ar);

    System.out.println("Pridavani prvku");
    ar.add(2, new CeleCislo(77));
    tiskni("ar", ar);

    System.out.println("Vytvoreni podseznamu");
    List<CeleCislo> sl = ar.subList(2, 5);
    tiskni("sl", sl);

    ar.get(3).setCislo(33);
    tiskni("ar", ar);
    tiskni("sl", sl);
  }
}
