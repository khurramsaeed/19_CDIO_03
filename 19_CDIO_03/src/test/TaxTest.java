package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.Player;
import entity.Refuge;
import entity.Tax;

public class TaxTest {

	  /**
     * Test of landOnField method, of class Tax.
     */
	
	//test of LandOnField of TAX, that taxAmount is withdrawn from players account
    @Test
    public void testLandOnField() {
        Tax instance = new Tax("Refuge1", 500);
        Player player = new Player("player1");
        instance.landOnField(player);
        int expResult = 29500;
        int result = player.getFortune();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTaxAmount method, of class Tax.
     */
    @Test
    public void testGetTaxAmount() {
        Tax instance = new Tax("TestTax", 1);
        int expResult = 1;
        int result = instance.getTaxAmount();
        assertEquals(expResult, result);


    }

}
