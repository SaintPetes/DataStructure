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
public class LinearNodeTest {
    
    public LinearNodeTest() {
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
     * Test of getNext method, of class LinearNode.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        LinearNode instance = new LinearNode();
        LinearNode expResult = null;
        LinearNode result = instance.getNext();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of setNext method, of class LinearNode.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        LinearNode instance = new LinearNode();
        instance.setNext(instance);
        assertEquals(instance.getNext(), instance);
        System.out.println("Test Success!");
    }

    /**
     * Test of getElement method, of class LinearNode.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        LinearNode<String> instance = new LinearNode<>();
        Object expResult = null;
        Object result = instance.getElement();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of setElement method, of class LinearNode.
     */
    @Test
    public void testSetElement() {
        System.out.println("setElement");
        LinearNode<String> instance = new LinearNode<>();
        instance.setElement("Test Node");
        assertEquals(instance.getElement(), "Test Node");
        System.out.println("Test Success!");
    }

    /**
     * Test of toString method, of class LinearNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinearNode instance = new LinearNode();
        String expResult = ("LinearNode " + " element = " + null + ", next = " + null);
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }
    
}
