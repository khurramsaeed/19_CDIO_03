package test;

import entity.Refuge;
import entity.Field;
import entity.Player;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RefugeTest {

	private Player player;
	private Field refuge200;
   	private Field refuge0;
   	private Field refugeNeg200;
   	
	@Before
	public void setUpBefore() throws Exception {
		this.player = new Player("Test Player");
		this.refuge200 = new Refuge("Agam +200", 200);
		this.refuge0 = new Refuge("Jonas 0", 0);
		this.refugeNeg200 = new Refuge("Thomas -200", -200);
	}

	@After
	public void tearDownAfter() throws Exception {
		this.player = new Player("Test Player");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
