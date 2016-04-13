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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getName method, of class Patient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Patient instance = new Patient("Tester Patient", 10);
        String expResult = "Tester Patient";
        String result = instance.getName();
        assertEquals(expResult, result);
   
      
    }

    /**
     * Test of setName method, of class Patient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Patient instance = new Patient("",10);
        instance.setName("Tester Patient");
        String expResult = "Tester Patient";
        String result = instance.getName();
        assertEquals(expResult, result);
      
      
    }

    /**
     * Test of getPriority method, of class Patient.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        Patient instance = new Patient("Tester Patient", 6);
        int expResult = 6;
        int result = instance.getPriority();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPriority method, of class Patient.
     */
    @Test
    public void testSetPriority() {
        System.out.println("setPriority");
        Patient instance = new Patient("",3);
        instance.setPriority(3);
        int expResult = 3;
        int result = instance.getPriority();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBed method, of class Patient.
     */
    @Test
    public void testGetBed() {
        System.out.println("getBed");
        Patient instance = new Patient("",10);
        Bed testBed = new Bed("Tester Bed","Test Ward");
        Bed expResult = testBed;
        instance.setBed(testBed);
        Bed result = instance.getBed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBed method, of class Patient.
     */
    @Test
    public void testSetBed() {
        System.out.println("setBed");
        Bed bed = new Bed("Tester Bed","Test Ward");
        Patient instance = new Patient();
        instance.setBed(bed);
        Bed expResult = bed;
        Bed result = instance.getBed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Patient.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Patient instance = new Patient("Tester Patient", 7);
        String expResult = "The patient: " + "Tester Patient" + " is a level " + 7 + " priority";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
