package cz.heroult.pavel.java.book.Kap10.S189;

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
class B {

    int b;

    public B(final int par) {
        b = par;
    }

    public void setB(final int par) {
        b = par;
    }

    public int getB() {
        return b;
    }
}

public class Hlavni {

    public static void main(final String[] argv) {
        B b = new B(3);
        A a = new A(5);

        System.out.println("a = " + a.getA() + ", b = " + b.getB());
    }
}
