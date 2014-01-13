package cz.heroult.pavel.java.book.Kap03.S33;

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

public class Komentare {

  /* metoda vypo�te obsah kruhu
     parametrem je polom�r kru�nice
     -- typick� koment�� p�es v�ce ��dek */
  static double obsahKruhu(double r) {
    return r * r * Math.PI;
  }

  public static void main(final String[] args) {
    int utrata;
    int pocetPiv = 5;

    utrata = pocetPiv * 15;  // typick� jedno��dkov� koment��
    System.out.println("Utrata = " + utrata);

    utrata = pocetPiv * /* 15 */ 20;  /* 15 je pro des�tku */
    System.out.println("Utrata = " + utrata);

    System.out.println("Obsah kruhu o polomeru 5 = " + obsahKruhu(5.0));
  }
}
