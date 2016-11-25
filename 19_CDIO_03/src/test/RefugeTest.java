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

	  /**
     * Test of getBonus method, of class Refuge.
     */
    @Test
    public void testGetBonus() {
        System.out.println("getBonus");
        Refuge instance = new Refuge("TestRefuge", 1);
        int expResult = 1;
        int result = instance.getBonus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBonus method, of class Refuge.
     */
    @Test
    public void testSetBonus() {
        System.out.println("setBonus");
        int bonus = 0;
        Refuge instance = new Refuge("TestRefuge", 1);
        instance.setBonus(bonus);
    }

    /**
     * Test of landOnField method, of class Refuge.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = new Player("TestPlayer");
        Refuge instance = new Refuge("TestRefuge", 1);
        instance.landOnField(player);
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
