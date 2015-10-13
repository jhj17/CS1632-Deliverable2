import java.util.ArrayList;

interface City {
  public ArrayList<Place> addPlaces();
  public Place findPlace(String dest);
  public Place getPlace(int index);
}
