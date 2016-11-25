package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FieldTest {

	 /**
     * Test of toString method, of class Field.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Field instance = new Territory("Test", 1, 1);
        String expResult = "Test";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of landOnField method, of class Field.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = new Player("TestPlayer");
        Field instance = new Tax("TestName", 1);
        instance.landOnField(player);
        fail("Didn't landOnField");
    }


}
