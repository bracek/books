package cz.heroult.pavel.bohatstvoKnihoven.kap02;

import java.util.*;

interface E {

     void tiskni();
}

class ABS {

     void tiskni() {
        System.out.println("A");
    }
}

 class DeklaraceWildcard {

     static void main(final String[] args) {
//        ArrayList<?> ar1 = new ArrayList<?>();  
//        ArrayList<? extends T> ar2 = new ArrayList<? extends T>();
//        ArrayList<? extends A> ar3 = new ArrayList<? extends A>();
    }
}

