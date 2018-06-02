/**
 * Jeg velger å bruke ArrayList, grunnen til dette
 * er at jeg ikke vet om boligen har noe unikt som kan
 * identifisere den slik at jeg kunne bruke HashMap, Jeg
 * er ikke sikker på om gnr eller bnr er unike, derfor velger
 * jeg å ikke bruke HashMap eller annen "mapping" collition.
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a real estate, lot or property
 * register, that store all properties in one list,
 * and can do som application, such as addin, removeing,
 * searching the register etc...
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class PropertyRegister {
    
    private final ArrayList<Property> properyList;
    
    /**
     *constructor for objects of propertyRegister class. 
     */
    public PropertyRegister() {
        this.properyList = new ArrayList<>();
    }
    
    /**
     * Adds a property to the register.
     * 
     * @param property property to add to the register
     */
    public void addProperty(Property property){
        this.properyList.add(property);
    }
    
    /**
     * Return the number of the registert properties.
     * 
     * @return the number of the registert properties
     */
    public int getNumberOfProperties(){
        return properyList.size();
    }
    
    /**
     * Find property with the given municipalityNumber, lotNumber and sectionNumber
     * if no property was found <code>null</code> is returned.
     * 
     * 
     * @param municipalityNumber the municipality number of property to find
     * @param lotNumber the lot number of the property to find
     * @param sectionNumber the section number of the property to find
     * @return the found property with the matching municipalityNumber, lotNumber and sectionNumber
     * if no match was found <code>null</code> is returned.
     */
    public Property searchPropertyRegister(int municipalityNumber, int lotNumber, int sectionNumber){
        Iterator<Property> it = properyList.iterator();
        Property foundProperty = null;
        boolean found = false;
        while(!found && it.hasNext()){
            Property property = it.next();
            if(property.getMunicipalityNumber() == municipalityNumber && property.getLotNumber() == lotNumber && property.getSectionNumber() == sectionNumber){
                foundProperty = property;
                found = true;
            }
        }
        return foundProperty;       
    }
    
    /**
     * Returns and property iterator.
     * 
     * @return propert iterator
     */
    public Iterator<Property> getPropertyRegisterIterator(){
        return properyList.iterator();
    }
    
    /**
     * Calculates the avrage area of all properties then
     * return it.
     * 
     * @return the avrage area of all properties
     */
    public int calculateAvrageArea(){
        int areaSum = 0;
        int numberOfProperties = properyList.size();
        for(int i = 0; i < numberOfProperties; i++){
            areaSum += properyList.get(i).getArea();
        }
        int avrageArea = areaSum/numberOfProperties;
        return avrageArea;
    }
    
    public void fillRegisterWithTestingData(){
        try{
            addProperty(new Property(12,"Alesund kommune",45,54,"leiliget", 34, "eier"));
            addProperty(new Property(1,"Trondheim kommune",30,17,"hybel", 12, "eier2"));
            addProperty(new Property(5,"Molde kommune",19,7,"hybel", 65, "eier3"));   
        }
        catch(NegativeNumberException e){
            //Message..
        }
    }
}
