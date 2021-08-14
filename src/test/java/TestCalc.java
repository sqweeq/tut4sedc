import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestCalc {
	@Test
	public void testCalc() {
		assertEquals(3, Calc.add(2, 1));
		System.out.println(Calc.add(2, 1));
	}
}