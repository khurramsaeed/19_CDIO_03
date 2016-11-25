package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TerritoryTest {

	 /**
     * Test of getRent method, of class Territory.
     */
    @Test
    public void testGetRent() {
        System.out.println("getRent");
        Territory instance = new Territory("TestTerritory", 1, 100);
        int expResult = 100;
        int result = instance.getRent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantityOfFields method, of class Territory.
     */
    @Test
    public void testSetQuantityOfFields() {
        Player player = new Player("TestPlayer");
        Territory instance = new Territory("TestTerritory", 10, 100);
        instance.setQuantityOfFields(player);
        int expResult = 1;
        int result = player.getQuantityOfTerritories();
        assertEquals(expResult, result);
    }
    
  //test of LandOnField, when field is not owned, and player choose to buy
    @Test
    public void testLandOnTerritory() {
        Territory instance = new Territory("Fleet1", 500, 0);
        Player player = new Player("player1");
        instance.landOnField(player);
        int expResult = 1;
        int result = player.getQuantityOfTerritories();
        assertEquals(expResult, result);
       
    }

}
