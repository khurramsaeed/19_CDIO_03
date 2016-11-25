package test;

import entity.Refuge;
import entity.Field;
import entity.Fleet;
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
        int bonus = 500;
        Refuge instance = new Refuge("TestRefuge", 1);
        instance.setBonus(bonus);
        int expResult = 500;
        int result = instance.getBonus();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of landOnField method, of class Refuge.
     */
  //test of LandOnField of refuge, that bonus enters players account
    @Test
    public void testLandOnRefuge() {
        Refuge instance = new Refuge("Refuge1", 500);
        Player player = new Player("player1");
        instance.landOnField(player);
        int expResult = 30500;
        int result = player.getFortune();
        assertEquals(expResult, result);
       
    }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
