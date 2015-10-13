import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

// JUnit test file for testing the Driver class
public class DriverTest {

	@Test
	// Given a current place, check that advancement is valid
	// Using a mocked driver and stubbing the current location and destination,
	// test that returned Place is the destination.
	public void testAdvanceSuccess() {
		Place testCurrPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		Random mockRandom = mock(Random.class);
		Driver testDriver = new Driver(new TheCity(),0,mockRandom);
		
		when(mockRandom.nextInt(2)).thenReturn(1);
		Place resPlace = testDriver.advance(testCurrPlace);
		String resName = resPlace.name;
		assertEquals(resName, "Coffee");
	}

	@Test
	// Generate a valid random starting location
	// From mocking random, generate random index to be 1 and then get the correct
	// starting location.
	public void testGetDriverID() {
		Random mockRandom = mock(Random.class);
		TheCity mockCity = mock(TheCity.class);
		Driver testDriver = new Driver(mockCity,2,mockRandom);
		
		int res = testDriver.getDriverId();
		assertEquals(res,2);
	}
	
	@Test
	// Generate a valid random starting location
	// From mocking random, generate random index to be 1 and then get the correct
	// starting location.
	public void testGetStartingLocation() {
		Random mockRandom = mock(Random.class);
		Driver testDriver = new Driver(new TheCity(),0,mockRandom);
		
		when(testDriver.getRandomIndex(5)).thenReturn(1);
		Place resPlace = testDriver.getStartLoc();
		String resName = resPlace.name;
		assertEquals(resName,"University");
	}

	@Test
	// Given a maximum value, get random number from 0 to max
	public void testRandomIndex() {
		TheCity mockCity = mock(TheCity.class);
		Random mockRandom = mock(Random.class);
		
		Driver testDriver = new Driver(mockCity,0,mockRandom);
		when(mockRandom.nextInt(2)).thenReturn(1);
		int res = testDriver.getRandomIndex(2);
		assertEquals(res,1);
	}

	@Test
	// Test traversal for current driver
	// From starting location of Bookstore, should travel to Outside City
	// via Fourth Ave.
	// Observe the console output to confirm correct traversal.
	public void testTraverse() {
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));
		
		TheCity testCity = new TheCity();
		Random mockRandom = mock(Random.class);
		Driver testDriver = new Driver(testCity,0,mockRandom);
		
		when(mockRandom.nextInt(5)).thenReturn(2);
		when(mockRandom.nextInt(2)).thenReturn(0);
		testDriver.traverse();
		
		final String standardOutput = myOut.toString();
		String target = "Driver 0 heading from Bookstore to Outside City via Fourth Ave.\n" + 
						"Driver 0 has left the city!\n";
		assertEquals(target,standardOutput);
	}

	@Test
	// Test string generation
	// Give a sample move from Mall to Bookstore via Fourth Ave.
	// Mock the driver class so that the driver is seen as Driver 1
	public void testToString() {
		Random mockRandom = mock(Random.class);
		Driver testDriver = new Driver(new TheCity(),1,mockRandom);
		
		String res = testDriver.toString("Mall","Bookstore","Fourth Ave.");
		String target = "Driver 1 heading from Mall to Bookstore via Fourth Ave.";
		assertEquals(target,res);
	}

}
