/**
 * Represents an owner of a property, that holds
 * information about the name and the adress of
 * the owner.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class Owner {
    // Person name or company name
    private final String name;
    // Adress of owner
    private final String Adress;
    
    /**
     * Constructor for owner objects
     * 
     * @param name name of the owner
     * @param Adress adress of the owner
     */
    public Owner(String name, String Adress) {
        this.name = name;
        this.Adress = Adress;
    }
    
    /**
     * Return the owners name.
     * @return the name of the woner
     */
    public String getName() {
        return name;
    }
    
    /**
     * Return the owners adress.
     * 
     * @return adress of the owner
     */
    public String getAdress() {
        return Adress;
    }
    
}
