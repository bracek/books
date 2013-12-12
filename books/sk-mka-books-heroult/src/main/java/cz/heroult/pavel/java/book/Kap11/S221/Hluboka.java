package cz.heroult.pavel.java.book.Kap11.S221;

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

class Pomocna implements Cloneable {
  double d;

  Pomocna(double d) {
    this.d = d;
  }

  protected Object clone() {
    Pomocna k = null;
    try {
      k = (Pomocna) super.clone();
      k.d = this.d;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return k;
  }
}

public class Hluboka implements Cloneable {
  int i;
  Pomocna dTrida;

  Hluboka(int i, Pomocna dt) {
    this.i = i;
    dTrida = dt;
  }

  protected Object clone() {
    Hluboka k = null;
    try {
      k = (Hluboka) super.clone();
      k.i = this.i;
      // pomoci konstruktoru -- nedoporucuje se
      // k.dTrida = new Pomocna(dTrida.d);
      // pomoci clone() -- univerzalni
      k.dTrida = (Pomocna) dTrida.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return k;
  }

  public static void main(String[] args) {
    Pomocna p = new Pomocna(3.14);
    Hluboka kopie, orig = new Hluboka(5, p);
    kopie = (Hluboka) orig.clone();
    System.out.println("orig: " + orig.i + "; " + orig.dTrida.d);
    System.out.println("kopie: " + kopie.i + "; " + kopie.dTrida.d);
    orig.i = 10;
    orig.dTrida.d = 6.28;
    System.out.println("orig: " + orig.i + "; " + orig.dTrida.d);
    System.out.println("kopie: " + kopie.i + "; " + kopie.dTrida.d);
  }
}
