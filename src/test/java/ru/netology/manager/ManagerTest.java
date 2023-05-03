package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void testWhenFewProductsFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, " Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);

        Product[] actual = manager.searchBy("Witcher");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchOneBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, " Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);

        Product[] actual = manager.searchBy("Witcher");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noneOfTheProductsFit() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, " Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);

        Product[] actual = manager.searchBy("");
        Product[] expected = {book1, book2, book3, phone1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void thereIsExactlyOneItem() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, " Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);

        Product[] actual = manager.searchBy("Redmi");
        Product[] expected = {phone1};

        Assertions.assertArrayEquals(expected, actual);

    }


}


