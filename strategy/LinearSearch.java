package strategy;

import java.util.ArrayList;

public class LinearSearch implements SearchBehavior{

    @Override
    public boolean contains(ArrayList<String> data, String item) {
        if (data.size() != 0) {
            for (String person : data) {
                if (person.equalsIgnoreCase(item)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}