package Test;
import static org.junit.Assert.*;

import org.junit.Test;
import entity.Cup;

public class CupTest {

	@Test
	public void test() {

        Cup instance = new Cup();
        int result = instance.getSum();
        if (result > 12 || result < 1) {
		fail("Ugyldig sum");
	}

}
}
