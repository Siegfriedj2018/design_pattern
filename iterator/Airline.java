/**
 * The airline class creates a list of flights.
 * @author Justin Siegfried  
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size = 0;

    /**
     * The airline constructor sets the title of the
     * airline an creates an array of flights with a 
     * default size of 2.
     * @param title The title of the airline.
     */
    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
    }

    /**
     * The addflight method adds a flight to the array and
     * if the array is full it calls growArray and then adds the
     * flight and updates the array count.
     * @param flightNum The flight number.
     * @param from The from location.
     * @param to The final destination.
     * @param duration The length of flight in minutes.
     * @param transfers The total number of stops.
     */
    public void addFlight(String flightNum, 
                          String from, 
                          String to, 
                          int duration, 
                          int transfers) {
        if (size > flights.length - 1) {
            flights = growArray(flights);
        }
        flights[size] = new Flight(flightNum, from, to, duration, transfers);
        size++;
    }

    /**
     * The accessor method for title.
     * @return Returns the title of airline.
     */
    public String getTitle() {
        return title;
    }

    /**
     * The growArray creates a new array that is double the array size of 
     * the current array of flights and copies the data to new array and
     * returns the new array.
     * @param flights The Flight array to increase the size.
     * @return Returns the new array with increased size.
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] temp = new Flight[size * 2];
        System.arraycopy(flights, 0, temp, 0, size);
        return temp;
    }

    /**
     * Creates an iterator to loop through the Flight array.
     * @return Returns a new FlightIterator with the current array of 
     * flights.
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}