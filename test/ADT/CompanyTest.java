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
public class CompanyTest {
    
    public CompanyTest() {
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
     * Test of run method, of class Company.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Company instance = new Company();
        instance.run();
       
    }

    /**
     * Test of findBestPaid method, of class Company.
     */
   @Test
    public void testFindBestPaid() {
        System.out.println("findBestPaid");
        FullTimeEmployee[] employeeArray = new FullTimeEmployee[2];
        Company instance = new Company();
        employeeArray[0] = new HourlyEmployee("John",90,9.0);
        employeeArray[1] = new FullTimeEmployee("Jerhn",900);
        FullTimeEmployee expResult = employeeArray[1];
        FullTimeEmployee result = instance.findBestPaid(employeeArray);
        assertEquals(expResult, result);
        
    }
    
}
