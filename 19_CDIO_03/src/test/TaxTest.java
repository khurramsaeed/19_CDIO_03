package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaxTest {

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
     * Test of landOnField method, of class Tax.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = null;
        Tax instance = null;
        instance.landOnField(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxAmount method, of class Tax.
     */
    @Test
    public void testGetTaxAmount() {
        System.out.println("getTaxAmount");
        Tax instance = null;
        int expResult = 0;
        int result = instance.getTaxAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
