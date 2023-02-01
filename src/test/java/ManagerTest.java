import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test

    public void searchByNameFewProductsFound(){
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Potter");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void searchByNameOneProductsFound(){
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("War");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void searchByNameNoProductsFound(){
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("LOTOR");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void searchByNameSmartphoneFound(){
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Smartphone smartphone1 = new Smartphone(1, "Galaxy", 15000, "Samsung");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book3);

        Product[] actual = manager.searchBy("Galaxy");
        Product[] expected = {smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }

}