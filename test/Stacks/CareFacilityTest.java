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
public class CareFacilityTest {
    
    public CareFacilityTest() {
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
     * Test of addPatient method, of class CareFacility.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        ArrayStack<Patient> pStack = new ArrayStack<>();
        Patient p1 = new Patient("Test p1", 5);
        Patient p2 = new Patient("Test p2", 4);
        Patient p3 = new Patient("Test p3", 1);
        pStack.push(p1);
        pStack.push(p2);
        pStack.push(p3);
        CareFacility instance = new CareFacility("Test Facility", pStack, null, null, null);
        instance.addPatient(p1);
        instance.addPatient(p1);
        instance.addPatient(p1);
    }

    /**
     * Test of sortPatients method, of class CareFacility.
     */
    @Test
    public void testSortPatients() {
        System.out.println("sortPatients");
        ArrayStack<Patient> patientStack =  new ArrayStack<>();
        Patient p0 = new Patient("Test P0",8);
        Patient p1 = new Patient("Test P1",7);
        Patient p2 = new Patient("Test P2",1);
        Patient p3 = new Patient("Test P3",4);
        patientStack.push(p0);
        patientStack.push(p1);
        patientStack.push(p2);
        patientStack.push(p3);
        CareFacility instance = new CareFacility("Test Lab", patientStack, null, null, null);
        ArrayStack<Patient> expResult = new ArrayStack();
        expResult.push(p0);
        expResult.push(p1);
        expResult.push(p3);
        expResult.push(p2);
        ArrayStack<Patient> result = instance.sortPatients(patientStack);
        assertEquals(expResult.toString(), result.toString());
        
    }

    /**
     * Test of assignBed method, of class CareFacility.
     */
    @Test
    public void testAssignBed() {
        System.out.println("assignBed");
        ArrayStack<Patient> patientStack = new ArrayStack<>();
        Patient p0 = new Patient("Test p0", 3);
        Patient p1 = new Patient("Test p1", 4);
        Patient p2 = new Patient("Test p2", 5);
        Patient p3 = new Patient("Test p3", 6);
        patientStack.push(p0);
        patientStack.push(p1);
        patientStack.push(p2);
        patientStack.push(p3);
        ArrayStack<Bed> bedStack = new ArrayStack<>();
        Bed b1 = new Bed("Test Bed1","Ward 1");
        Bed b2 = new Bed("Test Bed2","Ward 2");
        Bed b3 = new Bed("Test Bed3","Ward 3");
        bedStack.push(b1);
        bedStack.push(b2);
        bedStack.push(b3);
        //CareFacility instance = new CareFacility("Test Facility", patientStack, bedStack,null,null);
        //instance.assignBed(patientStack,bedStack);
        
    }

    /**
     * Test of getPatients method, of class CareFacility.
     */
    @Test
    public void testGetPatients() {
        System.out.println("getPatients");
        CareFacility instance = new CareFacility();
        ArrayStack<Patient> expResult = null;
        ArrayStack<Patient> result = instance.getPatients();
        assertEquals(expResult, result);
        
    }
    
}
