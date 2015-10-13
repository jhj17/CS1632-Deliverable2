/*
 * Jeffrey Josephs
 * CS 1632
 * Deliverable 2
 * CitySim9000.java
 */

import java.util.Random;

class CitySim9000 {
  
  public static void main(String[] args) {
    final int NUM_DRIVERS = 5;       // There will only be 5 drivers 
    int seedValue = 0;               // Seed value for random number generator
    Random randomObj = new Random(); // Random object for random number generation
    
    // Parse command line arguments
    seedValue = parseArguments(args);
    if(seedValue == -1)
      return;
    
    // Set up random number generator with the seed
    randomObj.setSeed(seedValue);
    
    // Create the city object
    TheCity city = new TheCity();
    
    // Drivers 0-4 will iterate traverse the city one after another
    for(int driverId = 0; driverId < NUM_DRIVERS; driverId++) {
      // Create driver that will traverse city
      Driver driver = new Driver(city, driverId, randomObj);
      
      // Traverse the city
      driver.traverse();
      
      // Print separator string to separate driver output
      System.out.println("-----");
    }
  } 
  
  /*
   * Function to parse the command line arguments
   * @param arguments   array of command line arguments
   * @return either the seed value or '-1' to represent an error
   */
  public static int parseArguments(String[] arguments) {
    int seed = 0;
    
    if (arguments.length == 1) {
      try {
        seed = Integer.parseInt(arguments[0]);
        if(seed <= 0) {
          System.out.println("Argument must be a positive integer.");
          seed = -1;
        }
      } catch (NumberFormatException e) {
        System.out.println("Argument must be an integer.");
        seed = -1;
      }
    }
    else {
      System.out.println("Invalid arguments!");
      System.out.println("Usage: java CitySim9000 <seed value>");
      seed = -1;
    }
    
    return seed;
  }
}
