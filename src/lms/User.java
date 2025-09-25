package lms;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int userId;
    private List<Book> issuedBooks = new ArrayList<>();

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

}
