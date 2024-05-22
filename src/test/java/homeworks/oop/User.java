package homeworks.oop;

import java.util.Arrays;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public void addBook(Book book) {
        Book[] extended = Arrays.copyOf(this.books, this.books.length + 1);
        extended[extended.length - 1] = book;
        this.books = extended;
    }
}