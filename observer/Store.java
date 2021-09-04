package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }

    @Override
    public void update(Book book) {
        if (bestSellers.size() < 5) {
            bestSellers.add(book);
        } else {
            bestSellers.remove();
            bestSellers.add(book);
        }
        
    }

    @Override
    public void display() {
        System.out.println("Top 5 bestsellers:");
        for (Book book : bestSellers) {
            System.out.println(" - " + book);
        }
        
    }
}