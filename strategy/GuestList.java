package strategy;

import java.util.ArrayList;

/**
 * Creates a list of guest with title and access to 
 *  change search behavior.
 * @author Justin Siegfried
 */
public class GuestList {
    protected String title;
    protected ArrayList<String> people;
    SearchBehavior searchBehavior;

    /**
     * Creates GuestList using arraylist, sets title, 
     * and default searchBehavior.
     * @param title A title for list for users.
     */
    public GuestList(String title) {
        people = new ArrayList<String>();
        this.title = title;
        searchBehavior = new LinearSearch();
    }

    /**
     * Searches Guestlist using specified searchBehavior and 
     * adds the user if not found and does nothing if found.
     * @param person A String of the the guest name to check in the list.
     * @return true if not found and false otherwise
     */
    public boolean add(String person) {
        if (!searchBehavior.contains(people, person)) {
            return people.add(person);
        }
        return false;
    }

    /**
     * Searches the Guestlist using specified searchBehavior and
     * removes if the guest is found and does nothing if not found.
     * @param person A String of the the guest name to check in the list.
     * @return true if found and false otherwise
     */
    public boolean remove(String person) {
        if (searchBehavior.contains(people, person)) {
            return people.remove(person);
        }

        return false;
    }

    /**
     * Retrieves the title to be displayed to the user.
     * @return The title that was given on creation of guestlist.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the guestlist.
     * @return The list that the user creates.
     */
    public ArrayList<String> getList() {
        return people;
    }

    /**
     * This allows the user to change the searchBehavior to 
     * the desired search method(if applicable)
     * @param searchBehavior the desired search method(linear or binary)
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
}
