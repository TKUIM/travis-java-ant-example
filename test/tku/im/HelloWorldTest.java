/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tku.im;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seke
 */
public class HelloWorldTest {
    
    public HelloWorldTest() {
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

    @Test
    public void testAdd() {
	assertEquals("calc.add(1, 1) should be equal to 2", HelloWorld.add(1, 1), 2);
    }
 
    @Test
    public void testSub() {
	assertEquals("calc.add(1, 1) should be equal to 2", HelloWorld.add(2, 1), 3);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorld.main(args);
        assertEquals("The test case is a prototype.",HelloWorld.add(1, 1), 2);
    }
    
}
