
public class Airline {
    private String title;
    private Flights[] flights;
    private int size;

    public Airline(String title) {
        this.title = title;
        size = 2;
        flights = new Flights[size];
    }

    public void addFlight(String flightNum, 
                          String from, 
                          String to, 
                          int duration, 
                          int transfers) {
        
    }

    public String getTitle() {
        return title;
    }

    private Flight[] growArray(Flight[] flights) {
        Flight[] temp = new Flight[size * 2];
        System.arraycopy(flights, 0, temp, 0, size);
        return temp;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    }
}