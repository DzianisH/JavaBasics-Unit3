package com.absoft.javabasic.part3.books;

public class Book {
    private String name;
    private final String author;

    public Book() {
        this("unknown book", "unknown author");
    }

    public Book(String name, String author) {
        this.author = author;
        this.name = name;
    }

    public String getBookTitle() {
        return name + " written by " + author;
    }

    public void setName(String name) {
        this.name = name;
    }
}
