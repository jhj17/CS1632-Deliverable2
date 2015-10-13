import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class TestCity {

	@Test
	// Test add places to place arraylist, arraylist should not be null
	public void testAddPlaces() {
		TheCity city = new TheCity();
		ArrayList<Place> res = city.addPlaces();
		assertNotNull(res);
	}

	@Test
	// Test get place from the place name
	public void testFindPlace() {
		TheCity city = new TheCity();
		String target = "University";
		Place res = city.findPlace(target);
		String resName = res.name;
		assertEquals(resName,target);
	}

	@Test
	// Test retrieval of place from given index
	public void testGetPlace() {
		TheCity city = new TheCity();
		String target = "University";
		Place res = city.getPlace(1);
		String resName = res.name;
		assertEquals(resName,target);
	}

	
}
