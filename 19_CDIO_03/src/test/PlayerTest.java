package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {


	 

    /**
     * Test of movePlayer method, of class Player.
     */
    @Test
    public void testMovePlayer() {
        int move = 22;
        Player instance = new Player ("testPlayer");
        instance.movePlayer(move);
        
        int expResult = 1;
        int result = instance.getCurrentPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of isBankrupt method, of class Player.
     */
    @Test
    public void testIsBankrupt() {
        Player instance = new Player("testPlayer");
        instance.setFortune(-30000);
        boolean expResult = true;
        boolean result = instance.isBankrupt();
        assertEquals(expResult, result);
      
        
    }

}
