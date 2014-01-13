package cz.heroult.pavel.java.book.Kap04.S78;

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

public class Tisky {
  public static void main(final String[] args) {
    int i, j;

    i = 4; j = 7;
    System.out.print("Toto je hodnota promenne i: " + i + "\n");

    System.out.println("Toto je hodnota promenne i: " + i);

    System.out.println("Toto je promenna i: "+i+"\na toto j: "+j);

    System.out.println("Soucet je " + i + j);

    System.out.println("Soucet je " + (i + j));

    System.out.println("Pracovali na 100%");

    System.out.println("Soucet je "+(i+j)+"\tSoucin je "+(i*j));

    System.out.println("\007Chyba, pokus o deleni nulou.");

    System.out.println("Toto je \"backslash\" : '\\'");

    System.out.println("Toto je 'backslash' : '\\'");
  }
}
