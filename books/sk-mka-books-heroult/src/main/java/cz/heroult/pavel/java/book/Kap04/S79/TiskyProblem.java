package cz.heroult.pavel.java.book.Kap04.S79;

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

public class TiskyProblem {
  public static void main(final String[] args) {
   char c = '\n'; 
   int i = 5;

   System.out.println(i + c);
   System.out.println(i + '\n');
   System.out.println("i " + i + '\n');
   System.out.println(i + '\n' + " i");
  }
}
