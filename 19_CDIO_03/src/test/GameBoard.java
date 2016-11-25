package test;

import entity.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameBoard {

	 /**
     * Test of getFields method, of class GameBoard.
     */
    @Test
    public void testGetFields() {
        System.out.println("getFields");
        GameBoard instance = new GameBoard();
        Field[] expResult = null;
        Field[] result = instance.getFields();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of landOnField method, of class GameBoard.
     */
    @Test
    public void testLandOnField() {
        System.out.println("landOnField");
        Player player = null;
        GameBoard instance = new GameBoard();
        instance.landOnField(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
