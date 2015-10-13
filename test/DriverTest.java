import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

// JUnit test file for testing the Driver class
public class DriverTest {

	@Test
	// Given a current place, check that advancement is valid
	public void testAdvanceSuccess() {
		
	}

	@Test
	// Generate a valid random starting location
	public void testGetStartingLocation() {
		
	}

	@Test
	// Given a maximum value, get random number from 0 to max
	public void testRandomIndex() {
		
	}

	@Test
	// Test traversal for current driver
	public void testTraverse() {

	}

	@Test
	// Test string generation
	public void testToString() {
		String target = "Driver 1 heading from Mall to Bookstore via Fourth Ave.";
		Driver mockDriver = mock(Driver.class);
		when(mockDriver.getDriverId()).thenReturn(1);
		String res = mockDriver.toString("Mall","BookStore","Fourth Ave.");
		assertEquals(target,res);
	}

}
