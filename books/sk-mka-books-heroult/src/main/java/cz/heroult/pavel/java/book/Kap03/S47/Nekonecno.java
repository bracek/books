package cz.heroult.pavel.java.book.Kap03.S47;

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

public class Nekonecno {
  public static void main(final String[] args) {
    double nula = 0.0;
    double vysledek = +5.0 / nula;

    System.out.println(vysledek);
    if (Double.POSITIVE_INFINITY == vysledek)
      System.out.println("kladne nekonecno");

    vysledek = -5.0 / nula;
    System.out.println(vysledek);

    if (Double.isInfinite(vysledek) == true)
      System.out.println("nekonecno");

    System.out.println("MAX = " + Float.MAX_VALUE +
                 ", 2 * MAX = " + (2 * Float.MAX_VALUE));

    vysledek = nula / nula;
    System.out.println(vysledek);

    if (Double.isNaN(vysledek) == true)
      System.out.println("neni cislo");
  }
}
