package test;

import entity.Cup;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CupTest {

	  /**
     * Test of throwDice method, of class Cup.
     */
    @Test
    public void testThrowDice() {
        System.out.println("throwDice");
        Cup instance = new Cup();
        instance.throwDice();
    }

    /**
     * Test of getD1Result method, of class Cup.
     */
    @Test
    public void testGetD1Result() {
        System.out.println("getD1Result");
        Cup instance = new Cup();
        int expResult = 0;
        int result = instance.getD1Result();
        assertEquals(expResult, result);
    }

    /**
     * Test of getD2Result method, of class Cup.
     */
    @Test
    public void testGetD2Result() {
        Cup instance = new Cup();
        int expResult = 0;
        int result = instance.getD2Result();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSum method, of class Cup.
     */
    @Test
    public void testGetSum() {
        Cup instance = new Cup();
        int result = instance.getSum();
        if (result > 12 || result < 2) {
        	fail("Terningen er ikke begrænset mellem 12 og 2");
     }
   }
} 
