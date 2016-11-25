package test;

import entity.Dice;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiceTest {

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

	   @Test
	    public void testGetFaceValue() {
	        System.out.println("getFaceValue");
	        Dice instance = new Dice();
	        int expResult = 0;
	        int result = instance.getFaceValue();
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    /**
	     * Test of roll method, of class Dice.
	     */
	    @Test
	    public void testRoll() {
	        System.out.println("roll");
	        Dice instance = new Dice();
	        instance.roll();
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }
	    

}
