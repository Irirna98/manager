package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    @Test
    public void testRemoveWhenProductExist() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, "Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(3);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, phone1};
        Assertions.assertArrayEquals(expected, actual);
        Assertions.assertThrows(NotFoundException.class,
                () -> repo.removeById(10)
        );
    }

    @Test
    public void testThereIsExactlyOneItem() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, "Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(3);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, phone1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoneOfTheProductsFit() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, " Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3, phone1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShouldSearchOneProduct() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Witcher", 100, "Sapkowski");
        Book book2 = new Book(2, "Neither sy", 200, "Sincero");
        Book book3 = new Book(3, "Witcher", 500, " Sapkowski");
        Smartphone phone1 = new Smartphone(4, "Redmi", 1000, "Xiaomi");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(4);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
}
