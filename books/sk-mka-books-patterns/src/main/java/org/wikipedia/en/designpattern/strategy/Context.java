
package org.wikipedia.en.designpattern.strategy;

/**
 *
 * @author bracek
 */
public class Context {

    private Strategy strategy;

    // Constructor
    public Context(final Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(final int a,
final  int b) {
        return strategy.execute(a, b);
    }

}
