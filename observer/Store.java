package observer;

import java.util.Queue;
import java.util.LinkedList;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        bestSellers = new LinkedList<Book>();
    }
}