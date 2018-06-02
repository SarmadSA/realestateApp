/**
 * Represents an exception class that is responsible for
 * validating object states that holds positive numbers, such as 
 * lotNumber, sectionNumber and other number that can not be negative.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class NegativeNumberException extends Exception {

    /**
     * Creates a new instance of <code>NegativeNumberException</code> without detail message.
     */
    public NegativeNumberException() {
    }

    /**
     * Constructs an instance of <code>NegativeNumberException</code> with the specified detail message.
     *
     * @param message the detail message.
     */
    public NegativeNumberException(String message) {
        super(message);
    }
}
