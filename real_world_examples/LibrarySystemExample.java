import java.util.ArrayList;
import java.util.List;

class Book {
    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        borrowed = true;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (!book.isBorrowed()) {
                book.displayDetails();
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.borrow();
                System.out.println("You borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book is not available.");
    }
}

public class LibrarySystemExample {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("Java: The Complete Reference", "Herbert Schildt"));

        System.out.println("Available books:");
        library.showAvailableBooks();
        library.borrowBook("Clean Code");
    }
}