package test;

import entity.Refuge;
import entity.Field;
import entity.Player;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RefugeTest {

	private Player player;
	private Field refuge200;
   	private Field refuge0;
   	private Field refugeNeg200;
   	
	@Before
	public void setUpBefore() throws Exception {
		this.player = new Player("Test Player");
		this.refuge200 = new Refuge("Agam +200", 200);
		this.refuge0 = new Refuge("Jonas 0", 0);
		this.refugeNeg200 = new Refuge("Thomas -200", -200);
	}

	@After
	public void tearDownAfter() throws Exception {
		this.player = new Player("Test Player");
	}

	  /**
     * Test of getBonus method, of class Refuge.
     */
    @Test
    public void testGetBonus() {
        System.out.println("getBonus");
        Refuge instance = null;
        int expResult = 0;
        int result = instance.getBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonus method, of class Refuge.
     */
    @Test
    public void testSetBonus() {
        System.out.println("setBonus");
        int bonus = 0;
        Refuge instance = null;
        instance.setBonus(bonus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of landOnField method, of class Refuge.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = null;
        Refuge instance = null;
        instance.landOnField(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
