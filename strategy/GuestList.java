package strategy;

import java.util.ArrayList;

public class GuestList {
    protected String title;
    protected ArrayList<String> people;
    SearchBehavior searchBehavior;

    public GuestList(String title) {
        people = new ArrayList<String>();
        this.title = title;
        searchBehavior = new LinearSearch();
    }

    public boolean add(String person) {
        if (!searchBehavior.contains(people, person)) {
            return people.add(person);
        }
        return false;
    }

    public boolean remove(String person) {
        if (searchBehavior.contains(people, person)) {
            return people.remove(person);
        }

        return false;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getList() {
        return people;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
}
