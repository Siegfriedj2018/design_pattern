package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class BinarySearch implements SearchBehavior {

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