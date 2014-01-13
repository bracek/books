package cz.heroult.pavel.java.book.Kap06.S117;

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

public class Metody3 {
  static void tiskPenez(int koruny) {
    System.out.println("Cena: " + koruny + " Kc");
  }

  public static void main(final String[] args) { 
    int a = 100, b = 50;   
    tiskPenez(a + b);
    tiskPenez(10);
    tiskPenez(a);
  }
}
