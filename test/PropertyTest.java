import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A JUnite test class that tests alle values
 * of the constructor.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class PropertyTest {
    
    private Property property;
    
    public PropertyTest() {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
        try{
            property = new Property(20, "Oslo Kommune", 23, 54, "bolig navn", 76, "Eieren");   
        }
        catch(NegativeNumberException e){
            //Message
        }
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown(){
        
    }
    
    /**
     * Test the initial constructor values (positive test).
     */
    @Test
    public void positiveConstructorTest(){
        assertEquals(20,property.getMunicipalityNumber());
        assertEquals("Oslo Kommune",property.getMunicipalityName());
        assertEquals(23,property.getLotNumber());
        assertEquals(54,property.getSectionNumber());
        assertEquals("bolig navn",property.getPropertyName());
        assertEquals(76,property.getArea());
        assertEquals("Eieren",property.getNameOfOwner());
    }
    
    /**
     * Test the initial constructor values (Negative test).
     */
    @Test
    public void negativeConstructorTest(){
        assertFalse(property.getMunicipalityNumber() <= 0);
        assertFalse(property.getMunicipalityName().equals("something wrong"));
        assertFalse(property.getLotNumber() <= 0);
        assertFalse(property.getSectionNumber() == 34);
        assertFalse(property.getPropertyName().equals(""));
        assertFalse(property.getArea() == 34);
        assertFalse(property.getNameOfOwner().equals("wrong"));

    }
}
