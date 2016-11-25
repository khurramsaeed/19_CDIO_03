package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FleetTest {



	   /**
     * Test of getRent method, of class Fleet.
     */
	//test of LandOnField, when field is not owned, and player choose to buy
    @Test
    public void testLandOnFleet() {
        Fleet instance = new Fleet("Fleet1", 500);
        Player player = new Player("player1");
        instance.landOnField(player);
        int expResult = 1;
        int result = player.getQuantityOfFleets();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setQuantityOfFields method, of class Fleet.
     */
    @Test
    public void testSetQuantityOfFields() {
        Player player = new Player("Player1");
        Fleet instance = new Fleet("Fleet2", 500);
        instance.setQuantityOfFields(player);
        int expResult = 1;
        int result = player.getQuantityOfFleets();
        assertEquals(expResult, result);
       
    }

}
