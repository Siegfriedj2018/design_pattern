import java.util.Iterator;

public class Airline {
    private String title;
    private Flight[] flights;
    private int size = 0;

    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
    }

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

    public String getTitle() {
        return title;
    }

    private Flight[] growArray(Flight[] flights) {
        Flight[] temp = new Flight[size * 2];
        System.arraycopy(flights, 0, temp, 0, size);
        return temp;
    }

    public FlightIterator createIterator() {
        FlightIterator fIterator = new FlightIterator(flights);
        return fIterator;
    }
}