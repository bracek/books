package sk.mka.books.patterns.abstractfactory;

/**
 * The SaladInstructionsKit is used to illustrate the Abstract Factory Pattern of GoF. The SaladInstructionsKit 
 * defines a factory type that list operations for creating the set of related  product types.
 * 
 * @author Andre Mare
 */
public interface SaladInstructionsKit {

     TomatoInstructions createTomatoInstructions();

     CucumberInstructions createCucumberInstructions();
} // class SaladInstructionsKit

