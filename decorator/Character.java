import java.util.ArrayList;

/**
 * This class creates a character inside an arraylist of 
 * strings that represents a text based version of character.
 * @author Justin Siegfried
 */
public class Character {
    protected ArrayList<String> sections;

    /**
     * The character constructor just initializes the 
     * sections arraylist as type string.
     */
    public Character() {
        sections = new ArrayList<String>();
    }

    /**
     * This method loops through the sections arraylist
     * and prints to the console.
     */
    public void draw() {
        for (String section : sections) {
            System.out.println(section);
        }
    }

}