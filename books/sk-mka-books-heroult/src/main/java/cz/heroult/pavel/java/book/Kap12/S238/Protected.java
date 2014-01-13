package cz.heroult.pavel.java.book.Kap12.S238;

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

class AProt {
  protected int i;
  protected int getI() { return i; }
}

class ABProt extends AProt {
  int j;
  ABProt() {
    i = 1;        // v po��dku 
    j = getI();   // v po��dku
  }
}

class BProt {
  int j;
  BProt() {
    AProt a = new AProt();
    a.i = 1;        // v po��dku
    j = a.getI();   // v po��dku
  }
}

public class Protected {
  public static void main(final String[] args) {
    ABProt ab = new ABProt();
    System.out.println("AB: i = " + ab.i + ", j = " + ab.j);
    BProt b = new BProt();
    System.out.println("B: j = " + b.j);
  }
}
