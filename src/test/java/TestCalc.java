import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestCalc extends TestCase {

	public void testCalc() {
		assertEquals(3, Calc.add(2, 1));
		System.out.println(Calc.add(2, 1));
	}
}