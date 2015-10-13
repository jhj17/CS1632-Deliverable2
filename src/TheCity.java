import java.util.ArrayList;

class TheCity implements City {

	private ArrayList<Place> places;

	public TheCity() {
		// Build the map
		// Create and add places to array list
		this.places = addPlaces();
	}

	/*
	 * Create places with dependencies
	 * @return the Array List containing all of the places
	 */
	public ArrayList<Place> addPlaces() {
		ArrayList<Place> place = new ArrayList<Place>();
		place.add(new Place("Mall", new String[]{"Fourth Ave.","Meow St."}, new String[]{"Bookstore","Coffee"}));
		place.add(new Place("University",  new String[]{"Fifth Ave.","Chirp St."}, new String[]{"Coffee","Bookstore"}));
		place.add(new Place("Bookstore",  new String[]{"Fourth Ave.","Chirp St."}, new String[]{"Outside City", "University"}));
		place.add(new Place("Coffee",  new String[]{"Fifth Ave.","Meow St."}, new String[]{"Outside City","Mall"}));
		place.add(new Place("Outside City",  new String[]{"Fourth Ave.","Fifth Ave."}, new String[]{"Mall","University"}));

		return place;
	}

	/*
	 * Find the place associated with the place name
	 * @param dest  then name of the destination
	 * @return the Place object of the destination
	 */
	public Place findPlace(String dest) {
		Place destPlace = null;

		// Iterate through places to get correct place
		for (Place temp : places) {
			if(temp.getName().equals(dest)) {
				destPlace = temp;
				break;
			}
		}

		return destPlace;
	}

	/*
	 * Get requested Place 
	 * @param index of requested place
	 * @return place object
	 */ 
	public Place getPlace(int index) {
		return places.get(index);
	}
}
