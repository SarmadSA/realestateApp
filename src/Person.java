/**
 * Represents a person owner of a property, that 
 * holds information about Social Security Number of
 * the person.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class Person extends Owner{
    // Social Security Number of person
    private final String socialSecurityNumber;
    
    /**
     * Constructor for person class objects
     * 
     * @param socialSecurityNumber Social Security Number of the person
     * @param name name of the person
     * @param Adress adress of the person
     */
    public Person(String socialSecurityNumber, String name, String Adress) {
        super(name, Adress);
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    /**
     * Return the persons Social Security Number.
     * 
     * @return Social Security Number of the person
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
}
