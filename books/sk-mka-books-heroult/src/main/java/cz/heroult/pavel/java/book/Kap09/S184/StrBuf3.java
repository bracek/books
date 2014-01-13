package cz.heroult.pavel.java.book.Kap09.S184;

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

public class StrBuf3 {
  public static void main(final String[] args) {
    StringBuffer b;

    b = new StringBuffer("Ahoj ");

    b.append(true);
    System.out.println(b);   // Ahoj true

    b.append(7);
    System.out.println(b);   // Ahoj true7

    b.delete(5, 9);
    System.out.println(b);   // Ahoj 7

    b.deleteCharAt(0);
    System.out.println(b);   // hoj 7

    b.insert(0, 3.14);
    b.insert(1, "HOJ");
    System.out.println(b);   // 3HOJ.14hoj 7

    b.replace(0, 5, "3,");
    System.out.println(b);   // 3,14hoj 7

    char c = b.charAt(0);
    System.out.println(c);   // 3

    b.setCharAt(1, '!');
    System.out.println(b);   // 3!14hoj 7
  }
}
