package ru.netology.manager;
public class Book extends Product {
    private String author;
    private String test;

    public Book(int id, String name, int check, String author) {
        super(id, name, check);
        this.author = author;
    }
}