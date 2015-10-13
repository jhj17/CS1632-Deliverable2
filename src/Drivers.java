interface Drivers {
  public Place advance(Place currLoc);
  public int getDriverId();
  public Place getStartLoc();
  public int getRandomIndex(int max);
  public void traverse();
  public String toString();
}
