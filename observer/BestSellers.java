package observer;

import java.util.ArrayList;

/**
 * Bestseller class implements the subject interface and 
 * it links the observer with a notification of a new book
 * added to the list.
 * @author Justin Siegfried
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Constructor for bestseller that instanitates the
     * observer and bestsellers list as ArrayList of type observer
     * and book respectfully.
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * When called addBook will add the book to the ArrayList of 
     * bestsellers and notify any registered observers
     * @param book the book to be added to the bestsellers list
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObserver(book);
    }

    /**
     * When called the registerObserver will add the observer to
     * the ArrayList of observers to be notified.
     * This is an overridden method from the subject interface.
     * @param observer An unregistered client that is to be added to
     * the list to receive updates.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer); 
    }

    /**
     * When called this removes an observer from the list.
     * This is an overridden method from the subject interface.
     * @param observer the registered client that is to
     * be removed from the list.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * When called this will notify the list of observer of a 
     * new book added to the list calling the update method of
     * each observer. This is an overridden method from subject
     * interface.
     * @param book the book that was added to the list.
     */
    @Override
    public void notifyObserver(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
}