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
     * Test of getD1Result method, of class Cup.
     */
    @Test
    public void testGetD1Result() { 
    	Cup instance = new Cup();
    	instance.throwDice();
    	int result = instance.getD1Result();

    	if(result > 6 || result < 1){
    		fail("Dice does not have 6 sides");	
    	}
    }

    /**
     * Test of getD2Result method, of class Cup.
     */
    @Test
    public void testGetD2Result() {
        Cup instance = new Cup();
        instance.throwDice();
        int result = instance.getD2Result();

        if(result > 6 || result < 1){
        fail("Dice does not have 6 sides");	
        }
    }

    /**
     * Test of getSum method, of class Cup.
     */
    @Test
    public void testGetSum() {
        Cup instance = new Cup();
        instance.throwDice();
        int result = instance.getSum();
        if (result > 12 || result < 2) {
        	fail("Terningen er ikke begrænset mellem 12 og 2");
     }
   }
} 
