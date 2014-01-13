package cz.heroult.pavel.java.book.Kap03.S42;

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

public class IntNaByte {
  public static void main(final String[] args) {
     int i; byte b;
     b = -1;   // -1 = 255 neznam�nkov�
     i = (b < 0) ? b + 256 : b;
     System.out.println("i = " + i);
     i = 128;
     b = (byte) ((i > 127) ? i - 256 : i);
     System.out.println("b = " + b);
     i = 100;
     b = (byte) ((i > 127) ? i - 256 : i);
     System.out.println("b = " + b);
  }
}
