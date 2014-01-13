package cz.heroult.pavel.bohatstvoKnihoven.kap07;


/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                   Java -- bohatstv� knihoven                //
//                II. opraven� a roz���en� vyd�n�              //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      //
//                       Cti_me.txt                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2006                      //
//                                                             //
/////////////////////////////////////////////////////////////////
import java.util.*;

public class FrontaLinkedList {

    public static void main(final String[] args) {
        Queue<String> fifoFronta = new LinkedList<String>();
        fifoFronta.add("5");
        fifoFronta.add("1");
        fifoFronta.add("3");
        System.out.println(fifoFronta);

        fifoFronta.add("2");
        fifoFronta.add("4");
        System.out.println(fifoFronta);

        System.out.println("Na cele je: " + fifoFronta.element());

        while (fifoFronta.isEmpty() == false) {
            System.out.print(fifoFronta.remove() + ", ");
        }
    }
}
