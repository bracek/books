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

class KomplikovanyObjekt {
  public static final int N = 100;
  private int[] pole;
  public KomplikovanyObjekt(final int init) {
    pole = new int[N];
    for (int i = 0;  i < N;  i++) {
      pole[i] = init + i;
    }
  }
  int nejakePouziti() {
    return pole[0];
  }
}

public class PraktickaWeakHashMap {
  public static void main(final String[] args) {
    int pocetPrvku = 10;
    int pocetVyberu = 20;
    // mozne nastaveni pomoci prikazove radky
    if (args.length > 0) {
      pocetPrvku = Integer.parseInt(args[0]);
    }
    if (args.length > 1) {
      pocetVyberu = Integer.parseInt(args[1]);
    }
    WeakHashMap<Integer, KomplikovanyObjekt> whm = 
         new WeakHashMap<Integer, KomplikovanyObjekt>();
    // casove narocne vytvoreni mapy
    for(int i = 0; i < pocetPrvku; i++) {
      whm.put(new Integer(i), new KomplikovanyObjekt(i));
    }

    // pouziti
    Random r = new Random(0);
    int zMapy = 0;
    int nove = 0;
    KomplikovanyObjekt ko;
    for (int i = 0;  i < pocetVyberu;  i++) {
      Integer klic = new Integer(r.nextInt(pocetPrvku));
      if ((ko = whm.get(klic)) != null) {
        // rychle vybrani predpripraveneho objeku
        zMapy++;
      }
      else {
        // pomaly vypocet nove instance objektu
        ko = new KomplikovanyObjekt(klic.intValue());
        nove++;
      }
      System.out.print(klic + "=" + ko.nejakePouziti() + ", ");
    }
    System.out.print("\nCelkove vyberu: " + pocetVyberu);
    System.out.println(", z mapy:" + zMapy + ", nove vytvoreni: " + nove);
  }
}

