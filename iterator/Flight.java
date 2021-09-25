/**
 * The Flight class defines what a flight is.
 * @author Justin Siegfried
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * The constructor creates a flight instance and 
     * assigns all the variables passed.
     * @param flightNum The flight number of current flight.
     * @param from The starting location of flight.
     * @param to The final destination of flight.
     * @param duration The total duration in minutes.
     * @param transfers The number of stops to final destination.
     */
    public Flight(String flightNum, 
                  String from, 
                  String to, 
                  int duration, 
                  int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * The accessor for From variable.
     * @return Returns starting location.
     */
    public String getFrom() {
        return from;
    }

    /**
     * The accessor for To variable.
     * @return Returns final destination.
     */
    public String getTo() {
        return to;
    }

    /**
     * The accessor for the total duration variable.
     * @return Returns the total duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * The accessor for the number of transfers.
     * @return Returns the number of transfers.
     */
    public int getNumTransfer() {
        return transfers;
    }

    /**
     * The string representation of a flight following the
     * supplied output file.
     */
    public String toString() {
        String result = "";
        int hour = duration / 60;
        int minutes = duration % 60;

        result = "FlightNumber: " + flightNum;
        result += "\nFrom: " + from;
        result += "\nTo: " + to;
        result += "\nDuration ";
        result += hour + " hours " + minutes + " minutes\n";
        result += (transfers == 0) ? "Direct Flight" : transfers + " Transfers";

        return result;
    }
}