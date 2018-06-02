/**
 * Represents a campany owner of a property, that 
 * holds information about the organitation number of
 * the company.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class Company extends Owner{
    //organitation number of the company
    private final String orgNumber; 

    /**
     * Constructor for company class objects
     * 
     * @param orgNumber organitation number of the company
     * @param name name of the company
     * @param Adress adress of the company
     */
    public Company(String orgNumber, String name, String Adress) {
        super(name, Adress);
        this.orgNumber = orgNumber;
    }
    
    /**
     * Return the company's organitation number.
     * 
     * @return organitation number of the company
     */
    public String getOrgNumber() {
        return orgNumber;
    }
    
}
