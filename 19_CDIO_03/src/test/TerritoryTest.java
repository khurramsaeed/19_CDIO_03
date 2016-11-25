package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TerritoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	 /**
     * Test of getRent method, of class Territory.
     */
    @Test
    public void testGetRent() {
        System.out.println("getRent");
        Territory instance = null;
        int expResult = 0;
        int result = instance.getRent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityOfFields method, of class Territory.
     */
    @Test
    public void testSetQuantityOfFields() {
        System.out.println("setQuantityOfFields");
        Player player = null;
        Territory instance = null;
        instance.setQuantityOfFields(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
