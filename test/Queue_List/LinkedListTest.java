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
public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Test of removeFirst method, of class LinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        LinkedList<String> instance = new LinkedList<>();
        instance.addFirst("Test Bed");
        instance.addFirst("Test Bed2");
        instance.addFirst("Test Bed3");
        Object expResult = "Test Bed3";
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of removeLast method, of class LinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        LinkedList<String> instance = new LinkedList<>();
        instance.addLast("Test Bed");
        instance.addLast("Test Bed2");
        instance.addLast("Test Bed3");
        Object expResult = "Test Bed";
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of first method, of class LinkedList.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        LinkedList<String> instance = new LinkedList<>();
        instance.addFirst("Test Bed");
        instance.addLast("Test Bed2");
        instance.addFirst("Test Bed3");
        Object expResult = "Test Bed3";
        Object result = instance.first();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of last method, of class LinkedList.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        LinkedList<String> instance = new LinkedList<>();
        instance.addLast("Test Bed");
        instance.addFirst("Test Bed2");
        instance.addFirst("Test Bed3");
        Object expResult = "Test Bed";
        Object result = instance.last();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedList instance = new LinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of copyList method, of class LinkedList.
     */
    @Test
    public void testCopyList() {
        System.out.println("copyList");
        LinkedList<String> instance = new LinkedList<>();
        instance.addFirst("Test Bed List Copy");
        LinkedList result = instance.copyList();
        if(instance == result){
            fail();
        }
        System.out.println("Test Success!");
    }

    /**
     * Test of toString method, of class LinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedList instance = new LinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of addLast method, of class LinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        LinkedList<String> instance = new LinkedList<>();
        instance.addLast("Test Bed");
        instance.addFirst("Test Bed2");
        instance.addLast("Test Bed3");
        assertEquals(instance.removeLast(),"Test Bed");  
        System.out.println("Test Success!");
    }

    /**
     * Test of addFirst method, of class LinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        LinkedList<String> instance = new LinkedList<>();
        instance.addFirst("Test Bed");
        instance.addFirst("Test Bed2");
        instance.addLast("Test Bed3");
        assertEquals(instance.removeFirst(),"Test Bed2");
        System.out.println("Test Success!");
    }
    
}
