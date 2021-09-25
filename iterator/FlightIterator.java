import java.util.Iterator;
/**
 * The flight iterator creates an iterator that keeps track of the flight
 * in a loop.
 * @author Justin Siegfried
 */
public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

    /**
     * Creates a flight iterator instance and sets the this flight array
     * with the parameter.
     * @param flights The current flight array.
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * This method is used to see if there is a next element in an array.
     * @return Returns true if array has a next element, false otherwise.
     */
    public boolean hasNext() {
        if (position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * This method gets the next element in the array and returns it.
     * @return Returns the next element in array.
     */
    public Flight next() {
        Flight flight = flights[position];
        position++;
        return flight;
    }
}