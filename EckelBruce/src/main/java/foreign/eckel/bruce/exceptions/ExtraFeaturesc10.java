package foreign.eckel.bruce.exceptions;

import foreign.eckel.bruce.exceptions.*;

/**
 *
 * @author bracek
 */
class MojaVynimka2 extends Exception {

    public MojaVynimka2() {
    }

    public MojaVynimka2(final String zprava) {
        super(zprava);
    }

    public MojaVynimka2(final String zprava,
final  int x) {
        super(zprava);
        i = x;
    }

    public int val() {
        return i;
    }
    private int i;
}

public class ExtraFeaturesc10 {

    public static void f() throws MojaVynimka2 {
        System.out.println("vyvolanie vynimky MojaVynimka2 z metody f()");
        throw new MojaVynimka2();
    }

    public static void g() throws MojaVynimka2 {
        System.out.println("vyvolanie vynimky SimpleException z metody g()");
        throw new MojaVynimka2("Povod vynimky je v metode g()");
    }

    public static void h() throws MojaVynimka2 {
        System.out.println("vyvolanie vynimky SimpleException z metody h()");
        throw new MojaVynimka2("Povod vynimky je v metode h()", 47);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {

        try {
            f();
        } catch (MojaVynimka2 e) {
            e.printStackTrace(System.err);
        }

        try {
            g();
        } catch (MojaVynimka2 e) {
            e.printStackTrace(System.err);
        }


        try {
            h();
        } catch (MojaVynimka2 e) {
            e.printStackTrace(System.err);
            System.err.println("e.val()=" + e.val());
        }
    }
}
