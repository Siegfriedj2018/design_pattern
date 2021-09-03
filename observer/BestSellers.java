package observer;

import java.util.ArrayList;

public class BestSellers implements Subject{
    protected ArrayList<Observer> observers;
    protected ArrayList<Book> bestSellers;

    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void notifyObserver(Book book) {
        // TODO Auto-generated method stub
        
    }
}