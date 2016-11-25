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
        Territory instance = new Territory("TestTerritory", 1, 1);
        int expResult = 1;
        int result = instance.getRent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantityOfFields method, of class Territory.
     */
    @Test
    public void testSetQuantityOfFields() {
        System.out.println("setQuantityOfFields");
        Player player = new Player("TestPlayer");
        Territory instance = new Territory("TestTerritory", 1, 1);
        instance.setQuantityOfFields(player);
        int expResult = player.getQuantityOfTerritories();
        int result = 1;
        assertEquals(expResult, result);
    }

}
