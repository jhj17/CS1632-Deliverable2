import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

// JUnit test file for testing the Place class
public class PlaceTest {

	@Test
	// Get the name of the place
	public void testGetPlaceName() {
		Place testPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		String target = "Mall";
		String res = testPlace.getName();
		assertEquals(res, target);
	}

	@Test
	// Get the next possible places from the current place
	public void testGetNextPlaces() {
		Place testPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		String[] target = new String[]{"Bookstore","Coffee"};
		String[] res = testPlace.getNextPlaces();
		Assert.assertArrayEquals(res, target);
	}

	@Test
	// Get the street of a given index of the current place
	public void testGetStreet() {
		Place testPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		String target = "Meow St.";
		String res = testPlace.getStreet(1);
		assertEquals(res, target);
	}
}

