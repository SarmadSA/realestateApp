/**
 * Represents a real estate, lot or property
 * that is located in Norway, and holds all 
 * necessary informatin about it.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class Property {
    private final int municipalityNumber;
    private final String municipalityName;
    private final int lotNumber;
    private final int sectionNumber;
    private final String propertyName;
    private final int area;
    private String nameOfOwner;
    
    /**
     * Constructor for objects of class Property.
     * 
     * @param municipalityNumber number of municipality
     * @param municipalityName name of municipality
     * @param lotNumber the lot number of the property
     * @param sectionNumber the section number of the property
     * @param propertyName the name of the lot
     * @param area the area of the property in meters squared
     * @param nameOfOwner name of the owner of the property
     * @throws NegativeNumberException exception throwen when a positive value is set to negativ
     */
    public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String propertyName, int area, String nameOfOwner) throws NegativeNumberException{
        if(lotNumber <= 0){
            throw new NegativeNumberException();
        }
        else{
            this.municipalityNumber = municipalityNumber;
            this.municipalityName = municipalityName;
            this.lotNumber = lotNumber;
            this.sectionNumber = sectionNumber;
            this.propertyName = propertyName;
            this.area = area;
            this.nameOfOwner = nameOfOwner;   
        }
    }
    
    /**
     * Returns the municipality number of where the property is located.
     * 
     * @return the municipality number 
     */
    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    /**
     * Returns the municipality name of where the property is located.
     * 
     * @return the municipality name 
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Returns the lot number of the property.
     * 
     * @return the lot number
     */
    public int getLotNumber() {
        return lotNumber;
    }

    /**
     * Returns the section number of the property.
     * 
     * @return the section number
     */
    public int getSectionNumber() {
        return sectionNumber;
    }
    
    /**
     * Returns the name of the lot/property.
     * 
     * @return the lot/property name
     */
    public String getPropertyName() {
        return propertyName;
    }
    
    /**
     * Returns the size/area of the property in meters squared.
     * 
     * @return the size
     */
    public int getArea() {
        return area;
    }
    /**
     * Returns the name of the owner of the property.
     * 
     * @return the name of the owner.
     */
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    /**
     * Changes/sets the name of the owner to a new owner.
     * 
     * @param nameOfOwner the new owners name 
     */
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }
    
}
