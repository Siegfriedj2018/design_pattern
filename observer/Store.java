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
        if (bestSellers.size() <= 5) {
            bestSellers.add(book);
        } else {
        }
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }
}