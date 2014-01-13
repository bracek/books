package cz.heroult.pavel.java.book.Kap09.S168;

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

public class Retez3 {
  public static void main(final String[] args) {
    String s1, s2, s3, s4;
    s1 = new String("ahoj");
    s2 = new String("ahoi");
    s3 = new String("AHOJ");

    System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
    System.out.println("s2.compareTo(s1): " + s2.compareTo(s1));
    System.out.println("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));
    System.out.println("s1.equals(s3): " + s1.equals(s3));
    System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
  }
}
