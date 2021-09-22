
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
        return "";
    }
}