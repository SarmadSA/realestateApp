import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * A JUnite test class that tests the value
 * of the avrage area.
 * 
 * @author candidate nr.: 1112
 * @version 01.06.2018
 */
public class PropertyRegisterTest {
    
    PropertyRegister propertyRegister;
    
    public PropertyRegisterTest() {
    }
    
       
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
        this.propertyRegister = new PropertyRegister();
         propertyRegister.fillRegisterWithTestingData();
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
     * Test the avrage area value (positive test).
     */
    @Test
    public void positiveAreaCalculationTest(){
        assertEquals(37,propertyRegister.calculateAvrageArea());
    }
    
    /**
     * Test the avrage area value (Negative test).
     */
    @Test
    public void negativeAreaCalculationTest(){
        assertFalse(propertyRegister.calculateAvrageArea() < 0);
    }
}
