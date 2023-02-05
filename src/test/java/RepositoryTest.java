import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepositoryTest {
    @Test
    public void testRemoveByIdThenIdIsCorrect() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addByIdCorrect() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "LOTR", 200, "Tolkien");
        Smartphone smartphone1 = new Smartphone(1, "Galaxy", 15000, "Samsung");

        repo.add(book1);
        repo.add(smartphone1);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, smartphone1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdAll() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);


        Product[] actual = repo.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdThenIdInCorrect() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(4);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdThenIdIsInCorrect2() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 100, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter 2", 100, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.removeById(4)
        );
    }

    


}