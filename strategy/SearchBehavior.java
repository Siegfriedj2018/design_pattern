package strategy;

import java.util.ArrayList;

/**
 * A searh behavior method that must use a contains to implement
 * whatever search style they want.
 * @author Justin Siegfried
 */
public interface SearchBehavior {
    /**
     * The method that is implemented by the user to search using
     * parameters.
     * @param data Arraylist of Strings that is going to be searched.
     * @param item The item that is being searched for.
     * @return true if item is found, false otherwise.
     */
    public boolean contains(ArrayList<String> data, String item);
}