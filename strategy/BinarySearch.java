package strategy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Does a binary search for a name in a list.
 * Binary Search reference: https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/
 * @author Justin Siegfried
 */
public class BinarySearch implements SearchBehavior {

    /**
     * An overridden method from the SearhBehavior interface that uses
     * a binary search for a name in a list.
     * @param data Arraylist of Strings that is going to be searched.
     * @param item The item that is being searched for.
     * @return true if item is found, false otherwise.
     */
    @Override
    public boolean contains(ArrayList<String> data, String item) {
        if (!data.isEmpty()) {
            Collections.sort(data);
            
            int leftIndex = 0;
            int rightIndex = data.size() - 1;
            while (leftIndex <= rightIndex) {
                int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
                String person = data.get(middleIndex);
                if (person.equalsIgnoreCase(item)) {
                    return true;
                }

                if (person.compareToIgnoreCase(item) < 0) {
                    leftIndex = middleIndex + 1;
                } else {
                    rightIndex = middleIndex - 1;
                }
            }
        }
        return false;
    }
    
}