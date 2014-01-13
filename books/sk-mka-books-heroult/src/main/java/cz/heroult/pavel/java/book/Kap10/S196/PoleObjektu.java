package cz.heroult.pavel.java.book.Kap10.S196;

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

class IntADouble {
  private int i;
  private double d;
  IntADouble(int i, double d) { this.i = i; this.d = d; }

  public void vypis() {
    System.out.println("i = " + i + ", d = " + d);
  }
}

public class PoleObjektu {
  public static void main(final String[] args) {
    IntADouble[] louka;
    louka = new IntADouble[3];
    for (int j = 0;  j < louka.length;  j++) {
      louka[j] = new IntADouble(j, (double) (j * 2));
    }
    for (int j = 0;  j < louka.length;  j++) {
      louka[j].vypis();
    }
  }
}
