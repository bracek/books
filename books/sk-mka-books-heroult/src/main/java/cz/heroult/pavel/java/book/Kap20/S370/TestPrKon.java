package cz.heroult.pavel.java.book.Kap20.S370;

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

public class TestPrKon {
  public static void main(final String[] args) {
    Cteni ct1 = new Cteni("data10.txt");
    Producent vlPr1 = new Producent(ct1);
    Konzument vlKon1 = new Konzument(ct1);
    vlKon1.start();
    vlPr1.start();   // schv�ln� pozd�ji ne� konzument

    Cteni ct2 = new Cteni("data20.txt");
    Producent vlPr2 = new Producent(ct2);
    Konzument vlKon2 = new Konzument(ct2);
    vlPr2.start();  
    vlKon2.start();
  }
}
