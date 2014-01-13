package cz.heroult.pavel.java.book.Kap05.S104;

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

public class ForBreak {
  public static void main(final String[] args) {
    System.out.print("Zacatek ");
 odskok:
    {
      for (int i = 1;  i < 10;  i++) {
        if (i == 5)
           break odskok;  
//        break;
        System.out.print(i + " ");
      }

      System.out.print("Stred ");
    }

    System.out.println("Konec");
  }
}
