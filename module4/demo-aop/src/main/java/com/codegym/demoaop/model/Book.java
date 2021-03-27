package com.codegym.demoaop.model;

import com.sun.javafx.beans.IDProperty;


public class Book {
    private int id ;
    private String name ;
    private int quantity ;

    public Book() {
    }

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
