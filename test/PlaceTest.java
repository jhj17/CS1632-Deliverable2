import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

// JUnit test file for testing the Place class
public class PlaceTest {

	@Test
	// Get the name of the place
	// With using a test place, test method to extract the name from the Place object.
	public void testGetPlaceName() {
		Place testPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		String target = "Mall";
		String res = testPlace.getName();
		assertEquals(res, target);
	}

	@Test
	// Get the next possible places from the current place
	// With using a test place, test ability to retrieve the next possible places array.
	public void testGetNextPlaces() {
		Place testPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		String[] target = new String[]{"Bookstore","Coffee"};
		String[] res = testPlace.getNextPlaces();
		Assert.assertArrayEquals(res, target);
	}

	@Test
	// Get the street of a given index of the current place
	// With using a test place, extract the street from the given index based on the place chosen.
	public void testGetStreet() {
		Place testPlace = new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"});
		String target = "Meow St.";
		String res = testPlace.getStreet(1);
		assertEquals(res, target);
	}
}

