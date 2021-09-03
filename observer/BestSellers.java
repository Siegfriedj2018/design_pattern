package observer;

import java.util.ArrayList;

public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObserver(book);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyObserver(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
        
    }
}