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
public class HourlyEmployeeTest {
    
    public HourlyEmployeeTest() {
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
     *Test of the default HourlyEmployee Constructor
     */
    @Test
    public void testDefaultHourlyEmployeeConstructor(){
        System.out.println("HourlyEmployee Constructor");
        HourlyEmployee instance = new HourlyEmployee();
        int hoursWorked = instance.getHoursWorked();
        assertEquals(0, hoursWorked);
        double result = instance.getPayRate();
        assertEquals(0.0, result, 0.001);
        double regularPay = instance.getRegularPay();
        assertEquals(0.0, regularPay, 0.001);
        double overtimePay = instance.getOvertimePay();
        assertEquals(0.0, overtimePay, 0.001);
        
        
    }

     /**
     *Test of the 2nd HourlyEmployee Constructor
     */
    @Test
    public void test2ndHourlyEmployeeConstructor(){
        System.out.println("HourlyEmployee Constructor");
        HourlyEmployee instance = new HourlyEmployee("Rupert", 90, 37.25);
        String name = instance.getName();
        assertEquals("Rupert",name);
        double grossPay = instance.getGrossPay();
        assertEquals(3352.5, grossPay, 0.001);
        int hoursWorked = instance.getHoursWorked();
        assertEquals(90, hoursWorked);
        double result = instance.getPayRate();
        assertEquals(37.25, result, 0.001);
        double regularPay = instance.getRegularPay();
        assertEquals(0.0, regularPay, 0.001);
        double overtimePay = instance.getOvertimePay();
        assertEquals(0.0, overtimePay, 0.001);
    }
    /**
     * Test of getHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        HourlyEmployee instance = new HourlyEmployee();
        int expResult = 0;
        int result = instance.getHoursWorked();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPayRate method, of class HourlyEmployee.
     */
    @Test
    public void testGetPayRate() {
        System.out.println("getPayRate");
        HourlyEmployee instance = new HourlyEmployee();
        double expResult = 0.0;
        double result = instance.getPayRate();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getRegularPay method, of class HourlyEmployee.
     */
    @Test
    public void testGetRegularPay() {
        System.out.println("getRegularPay");
        HourlyEmployee instance = new HourlyEmployee();
        double expResult = 0.0;
        double result = instance.getRegularPay();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getOvertimePay method, of class HourlyEmployee.
     */
    @Test
    public void testGetOvertimePay() {
        System.out.println("getOvertimePay");
        HourlyEmployee instance = new HourlyEmployee();
        double expResult = 0.0;
        double result = instance.getOvertimePay();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of toString method, of class HourlyEmployee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HourlyEmployee instance = new HourlyEmployee();
        String expResult = "HourlyEmployee" + "\n Hours Worked = " + 0 + 
                "\n Pay Rate = " + 0.0 + "\n Regular Pay = " + 0.0 + 
                "\n Overtime Pay = " + 0.0;
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
