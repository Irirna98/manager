package ru.netology.manager;

public class Smartphone extends Product {


    private String vendor;

    public Smartphone(int id, String name, int check, String vendor) {
        super(id, name, check);
        this.vendor = vendor;
    }
}