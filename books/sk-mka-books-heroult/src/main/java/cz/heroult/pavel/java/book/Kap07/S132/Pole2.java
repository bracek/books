package cz.heroult.pavel.java.book.Kap07.S132;

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

public class Pole2 {
  public static final int MAX = 20;

  public static void main(final String[] args) {
    int[] poleInt = new int[MAX];        // MAX vhodn�
    for (int i = 0;  i < MAX;  i++) {    // MAX nevhodn�
      poleInt[i] = i + 1;
      System.out.print(poleInt[i] + "  ");
    }
  }
}
