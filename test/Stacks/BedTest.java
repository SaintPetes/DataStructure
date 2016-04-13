/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

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
public class BedTest {
    
    public BedTest() {
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
     * Test of getName method, of class Bed.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Bed instance = new Bed("Tester Bed","Test Ward");
        String expResult = "Tester Bed";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Bed.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Bed instance = new Bed("Tester Bed","Test Ward");
        instance.setName("Tester Bed");
        String expResult = "Tester Bed";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Bed.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bed instance = new Bed("Tester Bed", "Test Ward");
        String expResult = "Bed: "+ "Tester Bed" + " is currently in " + "Test Ward";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getLocation method, of class Bed.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Bed instance = new Bed("Tester Bed", "Test Ward");
        String expResult = "Test Ward";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLocation method, of class Bed.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Bed instance = new Bed("Tester Bed", "Test Ward");
        instance.setLocation("Test Ward");
        String expResult = "Test Ward";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        
    }
    
}
