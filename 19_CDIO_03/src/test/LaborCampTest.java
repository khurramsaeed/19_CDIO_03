package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LaborCampTest {

	  
    @Test //test of LandOnField, when field is not owned, and player choose to buy
    public void testLandOnLaborCamp(){

    	LaborCamp instance = new LaborCamp("LaborCamp1", 700);
        Player player = new Player("player1");
        instance.landOnField(player);
        int expResult = 1;
        int result = player.getQuantityOfLaborCamps();
        assertEquals(expResult, result);
        }
    
    
 

    /**
     * Test of setQuantityOfFields method, of class LaborCamp.
     */
    @Test
    public void testSetQuantityOfFields() {
    	  Player player = new Player("Player1");
    	  LaborCamp instance = new LaborCamp("LaborCamp1", 700);
          instance.setQuantityOfFields(player);
          int expResult = 1;
          int result = player.getQuantityOfLaborCamps();
          assertEquals(expResult, result);
       
    
    }
    
    

}
