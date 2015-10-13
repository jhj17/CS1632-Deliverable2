import java.util.Random;

class Driver implements Drivers {
  
  private int driverID;
  private TheCity city;
  private Random randomObj;
  
  /*
   * Constructor for the Current Driver
   * @param city      Object that contains the map
   * @param id        Unique ID given to the driver (0-4)
   */
  public Driver(TheCity city, int id, Random randObj) {
    // Set intial values for driver
    this.city  = city;
    this.driverID = id;
    this.randomObj = randObj;
  }
  
  /*
   * Function to advance from current destination to next one
   * @param currLoc  the current location of the driver
   * @return the destination
   */ 
  public Place advance(Place currLoc){
    int randIndex = 0;
    String[] possiblePlaces;
    String nextPlace;
    String street;
    Place dest;
    
    // Generate random number for which destination to choose
    randIndex = getRandomIndex(2);
    
    // From random index, select next possible destination
    possiblePlaces = currLoc.getNextPlaces();
    nextPlace = possiblePlaces[randIndex];
    dest = city.findPlace(nextPlace);
    
    // Get street from chosen next destination
    street = currLoc.getStreet(randIndex);
    
    // Display driver movement
    System.out.println(toString(currLoc.getName(), dest.getName(), street));
    
    return dest;
  }
  
  /*
   * Function to get the driver ID
   * @return driver ID
   */
  public int getDriverId() {
	  return this.driverID;
  }
  
  /*
   * Function to get the driver's starting location
   * @return the starting location
   */
  public Place getStartLoc() {
    Place startLoc = null;
    int index = 0;
    
    // get random number to choose index out of city place array
    index = getRandomIndex(5);
    startLoc = city.getPlace(index);
    
    return startLoc;
  }
  
  /*
   * Function to get random index from a set max value
   * @param max  max value from random number generator
   * @return index randomly generated
   */
  public int getRandomIndex(int max) {
   int index = 0;
   
   index = randomObj.nextInt(max);
   
   return index;
  }
  
  /*
   * Function to traverse the map
   */
  public void traverse() {
    Place currentLocation;
    Place destination;
    currentLocation = getStartLoc();
    
    // Loop to move throughout city until reaching outside of city
    while(true) {
      // Move to next location
      destination = advance(currentLocation);
      
      // Check that destination is not "Outside City"
      // Will end traverse once outside of the city
      String destName = destination.getName();
      if(destName.equals("Outside City"))
        break;
      else
        currentLocation = destination;
    }
    
    System.out.println("Driver " + this.driverID + " has left the city!");
  }
  
  /*
   * Function to get the current location of the driver
   * @return output of driver's current route and destination
   */
  public String toString(String dest1, String dest2, String street) {
    String outputStr = "";
    
    // Driver x heading from a to b via c.
    outputStr = "Driver " + getDriverId() + " heading from " + 
        dest1 + " to " + dest2 + " via " + street;
      
    return outputStr;
  }
}
