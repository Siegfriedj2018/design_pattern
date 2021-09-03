package io.github.jiangdequan;

import java.util.ArrayList;

public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName) {

    }

    @Override
    public void update(Book book) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }


}