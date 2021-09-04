package observer;

/**
 * The Observers are the clients that will
 * recieve updates when a book is added.
 * @author Justin Siegfried
 */
public interface Observer {

    /**
     * This method must be implemented to update the
     * observer of a new book to be added using whatever
     * storage method desired.
     * @param book the new book made available.
     */
    public void update(Book book);

    /**
     * This method must be implemented to display the
     * observers list.
     */
    public void display();
}