
package org.wikipedia.en.designpattern.strategy;

/**
 *
 * @author bracek
 */

class ConcreteStrategyMultiply implements Strategy {

    public int execute(final int a,
final  int b) {
        System.out.println("Called ConcreteStrategyC's execute()");
        return a  * b;   // Do a multiplication with a and b
    }

}

