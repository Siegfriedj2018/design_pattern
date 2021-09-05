package observer;

import java.util.ArrayList;

/**
 * The customer class is a user that wants to be updated
 * on new books added to the bestsellers list.
 * This class inplements the observer interface.
 * @author Justin Siegfried
 */
public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Creates customer instance that is passed a subject, 
     * and first and last names. This also instantiates an ArrayList
     * to hold a list of books that the customer wants(wishList) and 
     * it also registers the customer so they can be notified of new 
     * bestsellers.
     * @param subject What the user is going to be registering with
     * @param firstName The first name of customer
     * @param lastName The last name of customer
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();
        this.subject.registerObserver(this);
    }

    /**
     * Updates the customer wishlist with a newly added book.
     * This method is an overridden method of observer.
     */
    @Override
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * Displays the wishlist to the user.
     * This method is an overridden method of observer.
     */
    @Override
    public void display() {
        System.out.println("Wish List:");
        for (Book book : wishList) {
            System.out.println(" - " + book);
        }
    }


}