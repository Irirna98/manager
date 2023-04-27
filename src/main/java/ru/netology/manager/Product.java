package ru.netology.manager;
public class Product {

    protected int id;
    protected String name;
    protected int check;

    public Product(int id, String name, int check) {
        this.id = id;
        this.name = name;
        this.check = check;
    }

    public int getId() {
        return id;

    }

    public String getName() {
        return name;

    }
}
