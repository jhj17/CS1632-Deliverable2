class Place implements Places {
  String name;
  String[] streets;
  String[] nextPlaces;
  
  public Place(String name, String[] streets, String[] nextPossible) {
   this.name = name;
   this.streets = streets;
   this.nextPlaces = nextPossible;
  }
  
  /*
   * Get the name of the place
   * @return the place name
   */ 
  public String getName() {
   return this.name; 
  }
  
  /*
   * Get the name of the next places
   * @return the next places
   */ 
  public String[] getNextPlaces() {
   return this.nextPlaces; 
  }
  
  /*
   * Get the street based on the index
   * @param id  index of the street to be chosen
   * @return the street
   */ 
  public String getStreet(int id) {
   return this.streets[id]; 
  }
}
