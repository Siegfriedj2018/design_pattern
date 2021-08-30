package strategy;

import java.util.ArrayList;
/**
 * Does a linear search on a list of names
 * @author Justin Siegfried
 */
public class LinearSearch implements SearchBehavior{
    
    /**
     * An overridden method from the SearhBehavior interface that searches
     * linearly for a name in a list
     * @param data Arraylist of Strings that is going to be searched.
     * @param item The item that is being searched for.
     * @return true if item is found, false otherwise.
     */
    @Override
    public boolean contains(ArrayList<String> data, String item) {
        if (!data.isEmpty()) {
            for (String person : data) {
                if (person.equalsIgnoreCase(item)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}