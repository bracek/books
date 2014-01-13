package cz.heroult.pavel.java.book.Kap20.S348;

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
public class Vlakno2 extends Thread {

    @Override
    public void run() {
        while (ReadVl.hotovo == false) {
            System.out.print(ReadVl.suma + "\r");
            Thread.yield();
        }
        System.out.println(ReadVl.suma);
    }

    public static void main(final String[] args) {
        ReadVl vlCteni = new ReadVl("data.txt");
        vlCteni.start();
        Vlakno2 vlVypis = new Vlakno2();
        vlVypis.start();
    }
}
