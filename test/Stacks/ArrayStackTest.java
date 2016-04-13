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
public class ArrayStackTest {
    
    public ArrayStackTest() {
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
     * Test of isEmpty method, of class ArrayStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayStack instance = new ArrayStack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of peek method, of class ArrayStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("test peek");
        ArrayStack<Integer> instance = new ArrayStack<>();
        Integer x = 9;
        Integer y = 8;
        Integer z = 7;
        instance.push(x);
        instance.push(y);
        instance.push(z);
        Object result = instance.peek();
        assertEquals(z, result);
        
    }

    /**
     * Test of pop method, of class ArrayStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("test pop");
        ArrayStack<Integer> instance = new ArrayStack<>();
        Integer x = 9;
        Integer y = 8;
        Integer z = 7;
       instance.push(x);
       instance.push(y);
       instance.push(z);
        try{
           instance.pop();
           instance.pop();
           instance.pop();
           instance.pop();
       }catch (EmptyCollectionException e){
           System.out.println(e);
       }
        
    }

    /**
     * Test of push method, of class ArrayStack.
     */
    @Test
    public void testPush() {
        System.out.println("test push");
        Integer x = 9;
        Integer y = 8;
        Integer z = 7;
        ArrayStack<Integer> instance = new ArrayStack<>();
        instance.push(x);
        instance.push(y);
        instance.push(z);
        System.out.println("Great Success!");
    }

    /**
     * Test of size method, of class ArrayStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayStack instance = new ArrayStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class ArrayStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayStack instance = new ArrayStack();
        String expResult = "The current number of patients are: " + 0 +" ";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
