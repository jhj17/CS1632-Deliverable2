import static org.junit.Assert.*;
import org.junit.Test;

public class TestCitySim9000 {

	@Test
	// Test parse arguments with a character
	// Test should result in an invalid input
	public void testParseArgumentsChar() {
		String[] testArgs = new String[]{"a"};
		int target = -1;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

	@Test
	// Test parse arguments with a positive integer
	// Test should result in a valid input
	public void testParseArgumentsSuccess() {
		String[] testArgs = new String[]{"7"};
		int target = 7;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

	@Test
	// Test parse arguments with a negative integer
	// Test should result in an invalid input
	public void testParseArgumentsNeg() {
		String[] testArgs = new String[]{"-10"};
		int target = -1;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

	@Test
	// Test parse arguments with multiple arguments
	// Test should result in an invalid input
	public void testParseArgumentsMultiple() {
		String[] testArgs = new String[]{"a","1"};
		int target = -1;        
		int res = CitySim9000.parseArguments(testArgs);
		assertEquals(res, target);
	}

}
