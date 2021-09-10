
import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;

    public Character() {
        sections = new ArrayList<String>();
    }

    public void draw() {
        for (String section : sections) {
            System.out.println(section);
        }
    }

}