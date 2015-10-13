import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;


//JUnit test file for testing the TheCity class
public class TestCity {

	@Test
	// Test add places to place arraylist, arraylist should not be null
	// Test will check that the Array List is the correct size as well.
	public void testAddPlaces() {
		TheCity city = new TheCity();
		ArrayList<Place> res = city.addPlaces();
		int sizeArrayList = res.size();
		assertNotNull(res);
		assertEquals(sizeArrayList,5);
	}

	@Test
	// Test get place from the place name
	// With target of University, finding the place object should result
	// in a place with attribute name to also be University
	public void testFindPlace() {
		TheCity city = new TheCity();
		String target = "University";
		Place res = city.findPlace(target);
		String resName = res.name;
		assertEquals(resName,target);
	}

	@Test
	// Test retrieval of place from given index
	// With target place of University, getting the place in the ArrayList
	// at index 1 should result with the attribute name equal to University.
	public void testGetPlace() {
		TheCity city = new TheCity();
		String target = "University";
		Place res = city.getPlace(1);
		String resName = res.name;
		assertEquals(resName,target);
	}

	
}
