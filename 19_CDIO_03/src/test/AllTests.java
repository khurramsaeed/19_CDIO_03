package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, CupTest.class, DiceTest.class, FleetTest.class, LaborCampTest.class,
		PlayerTest.class, RefugeTest.class, TaxTest.class, TerritoryTest.class })
public class AllTests {

}
