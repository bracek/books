package cz.heroult.pavel.java.book.Kap03.S70;

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

public class GrObjekt {
  public static void main(final String[] args) {
    final byte VIDITELNY = 1;
    final byte PREMISTITELNY = 2;
    final byte MENITELNY = 4;
    final byte SMAZATELNY = 8;

    byte stav = 0;       // s t�mto objektem nelze prov�det nic
    stav |= VIDITELNY;   // od t�to chv�le je viditeln�
    if ((stav & VIDITELNY) == VIDITELNY)
      System.out.println("je viditelny");

    stav &= ~VIDITELNY;      // od t�to chv�le je neviditeln�
    if ((stav & VIDITELNY) == VIDITELNY)
      System.out.println("viditelny");
  }
}
