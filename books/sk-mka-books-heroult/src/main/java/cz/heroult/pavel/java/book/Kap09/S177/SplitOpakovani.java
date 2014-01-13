package cz.heroult.pavel.java.book.Kap09.S177;

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

public class SplitOpakovani {
  public static void main(final String[] args) {
    String radka = "123  45 6 789";
    String [] podretezce = radka.split(" ");
    for (int i = 0;  i < podretezce.length;  i++) {
      if (podretezce[i].length() > 0) {
        int cislo = Integer.parseInt(podretezce[i]);
        System.out.println(cislo);
      }
    }
  }
}
