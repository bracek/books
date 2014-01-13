
package org.wikipedia.en.designpattern.strategy;

/**
 *
 * @author bracek
 */

class ConcreteStrategySubtract implements Strategy {

    public int execute(final int a,
final  int b) {
        System.out.println("Called ConcreteStrategyB's execute()");
        return a - b;  // Do a subtraction with a and b
    }

}
