package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {

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
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountBalance method, of class Player.
     */
    @Test
    public void testGetAccountBalance() {
        System.out.println("getAccountBalance");
        Player instance = null;
        int expResult = 0;
        int result = instance.getAccountBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFortune method, of class Player.
     */
    @Test
    public void testSetFortune() {
        System.out.println("setFortune");
        int value = 0;
        Player instance = null;
        instance.setFortune(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFortune method, of class Player.
     */
    @Test
    public void testGetFortune() {
        System.out.println("getFortune");
        Player instance = null;
        int expResult = 0;
        int result = instance.getFortune();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantityOfFleets method, of class Player.
     */
    @Test
    public void testGetQuantityOfFleets() {
        System.out.println("getQuantityOfFleets");
        Player instance = null;
        int expResult = 0;
        int result = instance.getQuantityOfFleets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantityOfTerritories method, of class Player.
     */
    @Test
    public void testGetQuantityOfTerritories() {
        System.out.println("getQuantityOfTerritories");
        Player instance = null;
        int expResult = 0;
        int result = instance.getQuantityOfTerritories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantityOfLaborCamps method, of class Player.
     */
    @Test
    public void testGetQuantityOfLaborCamps() {
        System.out.println("getQuantityOfLaborCamps");
        Player instance = null;
        int expResult = 0;
        int result = instance.getQuantityOfLaborCamps();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityOfFleets method, of class Player.
     */
    @Test
    public void testSetQuantityOfFleets() {
        System.out.println("setQuantityOfFleets");
        Player instance = null;
        instance.setQuantityOfFleets();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityOfTerritories method, of class Player.
     */
    @Test
    public void testSetQuantityOfTerritories() {
        System.out.println("setQuantityOfTerritories");
        Player instance = null;
        instance.setQuantityOfTerritories();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityOfLaborCamps method, of class Player.
     */
    @Test
    public void testSetQuantityOfLaborCamps() {
        System.out.println("setQuantityOfLaborCamps");
        Player instance = null;
        instance.setQuantityOfLaborCamps();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of movePlayer method, of class Player.
     */
    @Test
    public void testMovePlayer() {
        System.out.println("movePlayer");
        int move = 0;
        Player instance = null;
        int expResult = 0;
        int result = instance.movePlayer(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPosition method, of class Player.
     */
    @Test
    public void testGetCurrentPosition() {
        System.out.println("getCurrentPosition");
        Player instance = null;
        int expResult = 0;
        int result = instance.getCurrentPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBankrupt method, of class Player.
     */
    @Test
    public void testIsBankrupt() {
        System.out.println("isBankrupt");
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.isBankrupt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
