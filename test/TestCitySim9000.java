import static org.junit.Assert.*;
import org.junit.Test;

public class TestCitySim9000 {

	@Test
	// Test parse arguments with a character
	public void testParseArgumentsChar() {
		String[] testArgs = new String[]{"a"};
		int target = -1;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

	@Test
	// Test parse arguments with a positive integer
	public void testParseArgumentsSuccess() {
		String[] testArgs = new String[]{"7"};
		int target = 7;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

	@Test
	// Test parse arguments with a negative integer
	public void testParseArgumentsNeg() {
		String[] testArgs = new String[]{"-10"};
		int target = -1;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

	@Test
	// Test parse arguments with multiple arguments
	public void testParseArgumentsMultiple() {
		String[] testArgs = new String[]{"a","1"};
		int target = -1;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

}
