package cz.heroult.pavel.java.book.Kap07.S133;

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

public class ForEach {
  public static void main(final String[] args) {
    int[] pole = { 1, 3, 5, 7 };
    int suma = 0;
    
    for (int hodnota : pole) {
      suma += hodnota;
    }

    System.out.println("Suma = " + suma);
  }
}
