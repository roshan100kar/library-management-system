package lms;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java programming", "James Gosling"));
        library.addBook(new Book("Clean code", "Robert C. martin"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));

        library.addUser(new User("Roshan", 1));
        library.addUser(new User("Janna", 2));

        library.showAvailableBooks();

        library.issueBook(1, "clean code");
        library.showAvailableBooks();

        library.returnBook(1, "clean code");
        library.showAvailableBooks();

    }
}
