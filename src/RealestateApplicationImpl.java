
import java.util.Iterator;
import java.util.Scanner;

/**
 * Represents the RealestateApplication. The class is a delegate for the main
 * application and the menu-system. Any functions triggered by a menu selection
 * leads to a call to one of the methods in this class (via the
 * RealestateApplication interface).
 *
 * @author asty
 * @version 0.1
 */
public class RealestateApplicationImpl implements RealestateApplication
{
    //Register of properties.
    private PropertyRegister propertyRegiseter;
    
    @Override
    public void init()
    {
        this.propertyRegiseter = new PropertyRegister();
        this.fillRegistersWithDataForTesting();
    }
    
    @Override
    public void doAddRealestatToRegister() {
        Scanner reader = new Scanner(System.in);
        Property property = null;
        
        System.out.println();
        System.out.println("To add a new property please enter the following information:");
        
        System.out.println("Enter municipality name: ");
        String municipalityName = reader.nextLine();
        
        System.out.println("Enter property name: ");
        String propertyName = reader.nextLine();
        
        System.out.println("Enter owner name: ");
        String nameOfOwner = reader.nextLine();
        
        System.out.println("Enter municipality number: ");
        int municipalityNumber = reader.nextInt();
        
        System.out.println("Enter section number: ");
        int sectionNumber = reader.nextInt();
        
        System.out.println("Enter  the total area: ");
        int area = reader.nextInt();
        
        try{
            System.out.println("Enter lot number: ");
            int lotNumber = reader.nextInt();
        
            property = new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber, propertyName, area, nameOfOwner); 
        }
        catch(NegativeNumberException e){
            System.out.println("Lot Number can not be negative!");
        }
        
        if(property != null){
            propertyRegiseter.addProperty(property);
            System.out.println("The following property has successfully been added: ");
            printPropertyDetails(property);
        }
        else{
            System.out.println();
            System.out.println("Was not able to add property, please try again!");
        }
    }

    @Override
    public void doListAllRealestates() {
        Iterator<Property> it = propertyRegiseter.getPropertyRegisterIterator();
        System.out.println();
        if(!it.hasNext()){
            System.out.println("Property register i empty, there are no properties to show!");
        }
        else{
            System.out.println("------------ Properties -------------");
            while(it.hasNext()){
                Property p = it.next();
                printPropertyDetails(p);
            }
        }
    }

    @Override
    public void doFindRealestate() {
        Scanner reader = new Scanner(System.in);
        System.out.println();
        System.out.println("To find a property please enter the following information:");
        
        System.out.println("Enter municipality number: ");
        int municipalityNumber = reader.nextInt();
        
        System.out.println("Enter lot number (gnr.): ");
        int lotNumber = reader.nextInt();
        
        System.out.println("Enter section number (bnr.): ");
        int sectionNumber = reader.nextInt();
                
        Property p = propertyRegiseter.searchPropertyRegister(municipalityNumber, lotNumber, sectionNumber);

        if(p != null){
            System.out.println("----------Found property:----------- ");
            printPropertyDetails(p);
        }
        else{
            System.out.println();
            System.out.println("No property was found with the given information!");
        }

    }

    @Override
    public void doCalculateAverageRealestateArea() {
        System.out.println();
        int avrageArea = propertyRegiseter.calculateAvrageArea();
        System.out.println("Avrage area is: " + avrageArea + " meters squared");
    }
    
    /**
     * A helper method that fills the register(s) with some
     * data for testing purposes.
     */
    private void fillRegistersWithDataForTesting()
    {
        propertyRegiseter.fillRegisterWithTestingData();
    }
    
    /**
     * Prints all details about a given property.
     * 
     * @param property the property to print details of
     */
    private void printPropertyDetails(Property property){
        System.out.println();
        System.out.println("Municipality number: " + property.getMunicipalityNumber());
        System.out.println("Municipality name  : " + property.getMunicipalityName());
        System.out.println("lot number         : " + property.getLotNumber());
        System.out.println("Section number     : " + property.getSectionNumber());
        System.out.println("Property name      : " + property.getPropertyName());
        System.out.println("Total area         : " + property.getArea());
        System.out.println("Owner name         : " + property.getNameOfOwner());
    }
}
