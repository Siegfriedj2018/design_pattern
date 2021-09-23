
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

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

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumTransfer() {
        return transfers;
    }

    public String toString() {
        String result = "";
        int hour = 0;
        int minutes = 0;
        result = "FlightNumber: " + flightNum;
        result += "\nFrom: " + from;
        result += "\nTo: " + to;
        result += "\nDuration ";
        hour = duration / 60;
        minutes = duration % 60;
        result += hour + " hours " + minutes + " minutes";
        result += "\n" + transfers + " Transfers";
        return result;
    }
}