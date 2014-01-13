package cz.heroult.pavel.java.book.Kap08.S159;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                  U�ebnice jazyka Java                       //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       CTI_ME.TXT                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2000                      // 
//                                                             //
/////////////////////////////////////////////////////////////////

public class Prvocisla {
  public static final int MAX = 1000;
  public static final int cisla[] = new int[MAX];

  static {
    int pocet = 2;
    cisla[0] = 1;
    cisla[1] = 2;

  dalsi:
    for (int i = 3;  pocet < MAX;  i += 2) {
      for (int j = 2;  j < pocet;  j++) {
        if (i % cisla[j] == 0) {
          continue dalsi;
        }
      }
      cisla[pocet] = i;
      pocet++;
    }
  }

  public static void main(final String[] args) {
    System.out.println("Prvnich " + MAX + " prvocisel");
    for (int i = 0;  i < Prvocisla.cisla.length;  i++)
      System.out.print(cisla[i] + "  ");
  }
}
