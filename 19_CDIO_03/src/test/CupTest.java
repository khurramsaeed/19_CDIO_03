package test;

import entity.Cup;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CupTest {

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
     * Test of throwDice method, of class Cup.
     */
    @Test
    public void testThrowDice() {
        System.out.println("throwDice");
        Cup instance = new Cup();
        instance.throwDice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getD1Result method, of class Cup.
     */
    @Test
    public void testGetD1Result() {
        System.out.println("getD1Result");
        Cup instance = new Cup();
        int expResult = 0;
        int result = instance.getD1Result();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getD2Result method, of class Cup.
     */
    @Test
    public void testGetD2Result() {
        System.out.println("getD2Result");
        Cup instance = new Cup();
        int expResult = 0;
        int result = instance.getD2Result();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSum method, of class Cup.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        Cup instance = new Cup();
        int expResult = 0;
        int result = instance.getSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

}
