package cz.heroult.pavel.java.book.Kap09.S181;

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

public class MujString {
  int hodnota;

  MujString(int h) { hodnota = h; }

  public String toString() {  // public je nutny
     String jmenoTridy = new String(getClass().getName());
     return (jmenoTridy + ": " + hodnota);
  }
  void puvodniToString() {
    System.out.println(super.toString());
  }

  public static void main(final String[] args) {
    MujString s1 = new MujString(5);
    s1.puvodniToString();
    System.out.println(s1.toString());
  }
}
