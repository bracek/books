package cz.heroult.pavel.java.book.Kap11.S220;

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

public class Melka implements Cloneable {
  int i;
  Pomocna dTrida;

  Melka(int i, Pomocna dt) {
    this.i = i;
    dTrida = dt;
  }

  protected Object clone() {
    Melka k = null;
    try {
      k = (Melka) super.clone();
      k.i = this.i;
      k.dTrida = this.dTrida;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return k;
  }

  public static void main(final String[] args) {
    Pomocna p = new Pomocna(3.14);
    Melka kopie, orig = new Melka(5, p);
    kopie = (Melka) orig.clone();
    System.out.println("orig: " + orig.i + "; " + orig.dTrida.d);
    System.out.println("kopie: " + kopie.i + "; " + kopie.dTrida.d);
    orig.i = 10;
    orig.dTrida.d = 6.28;
    System.out.println("orig: " + orig.i + "; " + orig.dTrida.d);
    System.out.println("kopie: " + kopie.i + "; " + kopie.dTrida.d);
  }
}
