package cz.heroult.pavel.java.book.Kap11.S219;

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

public class Klon2 implements Cloneable {
  int i;

  Klon2(int i) { this.i = i; }

  protected Object clone() {
    Klon2 k = null;
    try {
      k = (Klon2) super.clone();
      k.i = this.i;
    }
    catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return k;
  }

  public static void main(final String[] args) {
    Klon2 kopie, orig = new Klon2(5);
    kopie = (Klon2) orig.clone();
    System.out.println("orig: " + orig.i);
    System.out.println("kopie: " + kopie.i);
  }
}
