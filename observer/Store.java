package observer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The store class is a user that will have the top 5 bestselling
 * books in a queue for other users. This class implements the 
 * observer interface.
 * @author Justin Siegfried
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Creates the store instance that takes in a subject.
     * This also registers the store with the subject so it 
     * can be updated with new items. It also creates a queue
     * of bestsellers displaying only the top five bestsellers.
     * @param subject What the user is going to be registering with
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }

    /**
     * Updates the bestsellers list with 5 newest books to be added
     * to the list and removes the oldest book.
     * This is an overridden method of the observer.
     * @param book The newly added book for the list.
     */
    @Override
    public void update(Book book) {
        if (bestSellers.size() < 5) {
            bestSellers.add(book);
        } else {
            bestSellers.remove();
            bestSellers.add(book);
        }
        
    }

    /**
     * Displays the bestsellers list to the user in specified
     * format.
     */
    @Override
    public void display() {
        System.out.println("Top 5 bestsellers:");
        for (Book book : bestSellers) {
            System.out.println(" - " + book);
        }
        
    }
}