import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

    public static void main(String[] args) {
        // Create a collection to store books
        List<Book> bookCollection = new ArrayList<>();

        // Add books to the collection
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780590353427");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        bookCollection.add(book1);
        bookCollection.add(book2);

        // Print all books in the collection
        System.out.println("Books in collection:");
        for (Book book : bookCollection) {
            System.out.println(book);
        }

        // Remove a book from the collection
        bookCollection.remove(book1);

        // Print the updated collection
        System.out.println("Books after removal:");
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }
}

