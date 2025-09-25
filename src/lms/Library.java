package lms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books = new ArrayList<>();
    private Map<Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void showAvailableBooks() {
        System.out.println("Available Books");
        for(Book b: books) {
            if(!b.isIssued()) {
                System.out.println(" - " + b);
            }
        }
    }

    public void issueBook(int userId, String bookTitle) {
        User user = users.get(userId);
        if(user == null) {
            System.out.println("User not found");
            return;
        }
        for (Book b: books) {
           if(b.getTitle().equalsIgnoreCase(bookTitle) && !b.isIssued())  {
               b.issueBook();
               user.issueBook(b);
               System.out.println("Book issued to " + user.getName());
               return;
           }
        }
        System.out.println("Book not available or already issued");
    }

    public void returnBook(int userId, String bookTitle) {
        User user = users.get(userId);
        if(user == null) {
            System.out.println("User not found");
            return;
        }
        for (Book b : user.getIssuedBooks()) {
            if(b.getTitle().equalsIgnoreCase(bookTitle)) {
                b.returnBook();
                user.returnBook(b);
                System.out.println("Book returned by " + user.getName());
                return;
            }
        }
        System.out.println("This user didnt issued that book");
    }
}
