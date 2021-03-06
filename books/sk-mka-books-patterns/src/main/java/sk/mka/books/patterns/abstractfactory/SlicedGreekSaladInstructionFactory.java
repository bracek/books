package sk.mka.books.patterns.abstractfactory;

/**
 * The SlicedGreekSaladInstructionFactory is used to illustrate the Abstract Factory Pattern of GoF. The 
 * SlicedGreekSaladInstructionFactory implements the list of operations and create the concrete product objects that is 
 * associated with the specific concrete factory class.
 * 
 * @author Andre Mare
 */
public class SlicedGreekSaladInstructionFactory implements SaladInstructionsKit {

    @Override
    public TomatoInstructions createTomatoInstructions() {
        return new SlicedTomatoInstructions();
    }

    @Override
    public CucumberInstructions createCucumberInstructions() {
        return new SlicedCucumberInstructions();
    }
} // class SlicedGreekSaladInstructionFactory

