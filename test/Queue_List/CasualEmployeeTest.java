/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue_List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author C0416146 Peter Hillar
 */
public class CasualEmployeeTest {
    
    public CasualEmployeeTest() {
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
     * Test of getAvailability method, of class CasualEmployee.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        CasualEmployee instance = new CasualEmployee("Test Employee", true);
        boolean expResult = true;
        boolean result = instance.getAvailability();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of setAvailability method, of class CasualEmployee.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        boolean avail = true;
        CasualEmployee instance = new CasualEmployee();
        instance.setAvailability(avail);
        boolean expResult = true;
        boolean result = instance.getAvailability();
        assertEquals(expResult, result);        
        System.out.println("Test Success!");
    }

    /**
     * Test of toString method, of class CasualEmployee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CasualEmployee instance = new CasualEmployee();
        String expResult = ("CasualEmployee " + " available = " + false);
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }
    
}
