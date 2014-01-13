package cz.heroult.pavel.java.book.Kap11.S223;

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

class Pomocna {
  double d;

  Pomocna(double d) {
    this.d = d;
  }
}

public class Rovnost {
  public static void main(final String[] args) {
    Pomocna p1 = new Pomocna(3.14);
    Pomocna p2 = new Pomocna(3.14);
    if (p1.equals(p2) == false)
      System.out.println("p1 != p2");

    Pomocna p3 = p1;
    if (p1.equals(p3) == true)
      System.out.println("p1 == p3");

    Double d1 = new Double(3.14);
    Double d2 = new Double(3.14);
    if (d1.equals(d2) == true)
      System.out.println("d1 == d2");
  }
}
