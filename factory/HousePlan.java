import java.util.ArrayList;

/**
 * The house plan class is what defines a house plan when a plan
 * is instantiated. This class is an abstract class that has two
 * methods that need to be handled by the child class.
 * @author Justin Siegfried
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * The constructor sets the instance variables for number of rooms,
     * the number of windows, the square feet, it also creates the arraylist
     * for the materials and features of each house plan and then it calls the 
     * setMaterials and setFeatures of each instance.
     * @param numRooms the number of rooms for each house plan
     * @param numWindows the number of windows for each house plan
     * @param squareFeet the total square feet of each house plan
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        setMaterials();
        setFeatures();
    }

    /**
     * The setMaterials is an abstract method that sets the material
     * arraylist.
     */
    protected abstract void setMaterials();

    /**
     * The setFeatures is an abstract method that sets the features
     * arraylist. 
     */
    protected abstract void setFeatures();

    /**
     * The getter method that returns the materials arraylist.
     * @return returns the materials arraylist
     */
    public ArrayList<String> getMaterials() {
        return materials;
    }

    /**
     * The getter method that returns the features arraylist.
     * @return returns the features arraylist
     */
    public ArrayList<String> getFeatures() {
        return features;
    }

    /**
     * The getter method that returns the number of rooms stored in numRooms.
     * @return returns the number of rooms
     */
    public int getNumRooms() {
        return numRooms;
    }

    /**
     * The getter method that returns the number of windows stored in numWindows.
     * @return returns the number of windows
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * The getter method that returns the total square feet stored in squareFeet.
     * @return returns the square feet
     */
    public int getSquareFeet() {
        return squareFeet;
    }

    /**
     * Returns a string representation of the house plan instance specifing
     * the square feet, number of rooms, number of windows, the materials and 
     * features. 
     */
    public String toString() {
        String result = "";
        result += "Square Feet: " + squareFeet + "\n";
        result += "Room: " + numRooms + "\n";
        result += "Windows: " + numWindows + "\n\n";

        result += "Materials:\n";
        for (String material : materials) {
            result += " - " + material + "\n";
        }

        result += "\nFeatures:\n";
        for (String feature : features) {
            result += " - " + feature + "\n";
        }

        return result;
    }
}