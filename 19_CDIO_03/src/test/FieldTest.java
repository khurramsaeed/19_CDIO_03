package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FieldTest {

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
     * Test of toString method, of class Field.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Field instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of landOnField method, of class Field.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = null;
        Field instance = null;
        instance.landOnField(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FieldImpl extends Field {

        public FieldImpl() {
            super("");
        }

        public void landOnField(Player player) {
        }
    }

}
