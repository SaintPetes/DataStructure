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
public class LinkedQueueTest {
    
    public LinkedQueueTest() {
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
     * Test of copyQueue method, of class LinkedQueue.
     */
    @Test
    public void testCopyQueue() {
        System.out.println("copyQueue");
        LinkedQueue<String> instance = new LinkedQueue<>();
        instance.enqueue("Test Copy of Employees");
        LinkedQueue result = instance.copyQueue();
        if (instance == result){
            fail();
        }
        System.out.println("Test Success!");
    }

    /**
     * Test of dequeue method, of class LinkedQueue.
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("dequeue");
        LinkedQueue<String> instance = new LinkedQueue<>();
        instance.enqueue("Test Casual Employee");
        instance.enqueue("Test Casual Employee2");
        instance.enqueue("Test Casual Employee3");
        Object expResult = "Test Casual Employee";
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of first method, of class LinkedQueue.
     */
    @Test
    public void testFirst() throws Exception {
        System.out.println("first");
        LinkedQueue<String> instance = new LinkedQueue<>();
        instance.enqueue("Test Casual Employee");
        instance.enqueue("Test Casual Employee2");
        instance.enqueue("Test Casual Employee3");
        Object expResult = "Test Casual Employee";
        Object result = instance.first();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of enqueue method, of class LinkedQueue.
     */
    @Test
    public void testEnqueue() {
        try{
        System.out.println("enqueue");
        LinkedQueue<String> instance = new LinkedQueue<>();
        instance.enqueue("Test Casual Employee");
        instance.enqueue("Test Casual Employee2");
        instance.enqueue("Test Casual Employee3");
        assertEquals(instance.dequeue(),"Test Casual Employee");
        }catch(EmptyCollectionException e){
            System.out.println(e);
        }
        System.out.println("Test Success!");
    }

    /**
     * Test of isEmpty method, of class LinkedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedQueue instance = new LinkedQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of size method, of class LinkedQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedQueue instance = new LinkedQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }

    /**
     * Test of toString method, of class LinkedQueue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedQueue instance = new LinkedQueue();
        String expResult = " ";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println("Test Success!");
    }
    
}
