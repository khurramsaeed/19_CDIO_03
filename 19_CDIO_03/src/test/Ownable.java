package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ownable {

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
     * Test of getPrice method, of class Ownable.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Ownable instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of landOnField method, of class Ownable.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = null;
        Ownable instance = null;
        instance.landOnField(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRent method, of class Ownable.
     */
    @Test
    public void testGetRent() {
        System.out.println("getRent");
        Ownable instance = null;
        int expResult = 0;
        int result = instance.getRent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityOfFields method, of class Ownable.
     */
    @Test
    public void testSetQuantityOfFields() {
        System.out.println("setQuantityOfFields");
        Player player = null;
        Ownable instance = null;
        instance.setQuantityOfFields(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class OwnableImpl extends Ownable {

        public OwnableImpl() {
            super("", 0);
        }

        public int getRent() {
            return 0;
        }

        public void setQuantityOfFields(Player player) {
        }
    }
    

}
