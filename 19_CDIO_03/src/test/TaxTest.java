package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.Player;
import entity.Tax;

public class TaxTest {

	  /**
     * Test of landOnField method, of class Tax.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = new Player("TestPlayer");
        Tax instance = new Tax("TestTax", 1);
        instance.landOnField(player);

    }

    /**
     * Test of getTaxAmount method, of class Tax.
     */
    @Test
    public void testGetTaxAmount() {
        System.out.println("getTaxAmount");
        Tax instance = new Tax("TestTax", 1);
        int expResult = 1;
        int result = instance.getTaxAmount();
        assertEquals(expResult, result);


    }

}
