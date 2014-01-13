package cz.heroult.pavel.bohatstvoKnihoven.kap06;

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

class Zasobnik<E> {

    private LinkedList<E> zasob = new LinkedList<E>();

    public void add(final E elem) {
        zasob.addFirst(elem);
    }

    public E remove() {
        return zasob.removeFirst();
    }

    public E get() {
        return zasob.getFirst();
    }

    public boolean isEmpty() {
        return zasob.isEmpty();
    }
}

public class PouzitiZasobniku {

    public static void main(final String[] args) {
        Zasobnik<String> zs = new Zasobnik<String>();
        zs.add("prvni");
        zs.add("druhy");
        zs.add("treti");
        System.out.println(zs.get());
        while (zs.isEmpty() == false) {
            System.out.print(zs.remove() + ", ");
        }

        System.out.println();
        Zasobnik<Integer> zi = new Zasobnik<Integer>();
        zi.add(new Integer(8));
        zi.add(new Integer(9));
        while (zi.isEmpty() == false) {
            System.out.print(zi.remove() + ", ");
        }
    }
}
