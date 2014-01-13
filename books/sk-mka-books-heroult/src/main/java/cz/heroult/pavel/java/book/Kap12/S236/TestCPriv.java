package cz.heroult.pavel.java.book.Kap12.S236;

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

class CPriv {
  private CPriv jinaC;
  private int i;

  CPriv(int i, CPriv jina) {
    this.i = i;
    jinaC = jina;
  }
  private int getI() { return i; }
  public void porovnani() {
    if (i == jinaC.i)
      System.out.println(i + " == " + jinaC.i);
    else
      System.out.println(i + " != " + jinaC.i);
  }
}

public class TestCPriv {
  public static void main(final String[] args) {
    CPriv c1 = new CPriv(1, null);
    CPriv c2 = new CPriv(2, c1);
    CPriv c3 = new CPriv(1, c1);
    c2.porovnani();
    c3.porovnani();
  }
}
