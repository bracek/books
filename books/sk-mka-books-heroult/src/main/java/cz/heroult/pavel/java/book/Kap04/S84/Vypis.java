package cz.heroult.pavel.java.book.Kap04.S84;

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

public class Vypis {
  public static void main(final String[] args) {
    double d = 1234.567;
    System.out.format("d = %f%n", d); // d = 1234,567000
    System.out.format("d = %g%n", d); // d = 1234.57
    d = 1234567;
    System.out.format("d = %g%n", d); // d = 1.23457e+06
    d = 123456.7;
    System.out.format("d = %e%n", d); // d = 1.234567e+05
    d = 1234.56;
    System.out.format("d = %-,11.3fahoj%n", d); // d = 1�234,560  ahoj
  }
}
 
