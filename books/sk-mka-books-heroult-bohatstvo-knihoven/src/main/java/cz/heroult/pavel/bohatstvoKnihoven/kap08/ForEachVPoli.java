package cz.heroult.pavel.bohatstvoKnihoven.kap08;

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
public class ForEachVPoli {

    public static void main(final String[] args) {
        System.out.println("Pole primitivnich datovych prvku:");
        int[] pole = {5, 6, 7, 8, 9};
        for (int hodnota : pole) {
            System.out.print(hodnota + ", ");
        }
    }
}
