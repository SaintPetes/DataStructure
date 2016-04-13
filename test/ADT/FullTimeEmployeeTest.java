/**
 * The purpose of this program is to create to two subclasses that use the 
 * Employee interface which allows the classes, FullTimeEmployee and HourlyEmployee
 * to have certain functions, so that a main class, known as Company can keep
 * track of the highest paid employee, with both the FullTimeEmployee's and 
 * HourlyEmployees stored in an array, all the classes are tested for functionality
 * so that no problems occur in the running of the programs, and if a program does
 * occur it is shown.
 */
package ADT;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter Hillar C0416146
 */
public class FullTimeEmployeeTest {
    
    public FullTimeEmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     *Test of the default FullTimeEmployee Constructor
     */
    @Test
    public void testDefaultFullTimeEmployeeConstructor(){
        System.out.println("FullTimeEmployee Constructor");
        FullTimeEmployee instance = new FullTimeEmployee();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult,result);
        double grossPay = instance.getGrossPay();
        assertEquals(0.0, grossPay, 0.001);
    }
    /**
     * Test of the 2nd FullTimeEmployee Constructor
     */
    @Test
    public void test2ndFullTimeEmployeeConstructor(){
        System.out.println("FullTimeEmployee 2nd Constructor");
        FullTimeEmployee instance = new FullTimeEmployee("Lord Rupert", 90000);
        String result = instance.getName();
        assertEquals("Lord Rupert",result);
        double grossPay = instance.getGrossPay();
        assertEquals(90000, grossPay, 0.001);
    }
    /**
     * Test of getName method, of class FullTimeEmployee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        FullTimeEmployee instance = new FullTimeEmployee();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGrossPay method, of class FullTimeEmployee.
     */
    @Test
    public void testGetGrossPay() {
        System.out.println("getGrossPay");
        FullTimeEmployee instance = new FullTimeEmployee();
        double expResult = 0.0;
        double result = instance.getGrossPay();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of toString method, of class FullTimeEmployee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FullTimeEmployee instance = new FullTimeEmployee();
        String expResult = "FullTimeEmployee" + "\n Full Time Employee Name = " + null
                + "\n Gross Pay = " + 0.0 ;
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
