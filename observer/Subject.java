package observer;

/**
 * The Subject is a client that want to be notified by
 * the system to a new book.
 * @author Justin Siegfried
 */
public interface Subject {

    /**
     * The registerObserver will add the observer/client to a list 
     * to be notified of new books. This must be implemented.
     * @param observer An unregistered client that is to be notified 
     * of new books
     */
    public void registerObserver(Observer observer);

    /**
     * The removeObserver will remove a registered observer/client
     * from a list. This must be implemented.
     * @param observer A registered client that is to be removed.
     */
    public void removeObserver(Observer observer);

    /**
     * The notifyObserver will alert the observer/client of a new book.
     * @param book The new book added.
     */
    public void notifyObserver(Book book);
}