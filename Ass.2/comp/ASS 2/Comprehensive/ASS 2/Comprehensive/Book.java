package Comprehensive;
//Extend the Book class: create an array of 5 Book objects. 
// Add a method to check if a book's title matches a user-given string (via Scanner). 
// If found, display its author and ISBN.
import java.util.Scanner;
public class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayInfo() {
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        books[2] = new Book("1984", "George Orwell", "978-0451524935");
        books[3] = new Book("Moby Dick", "Herman Melville", "978-0142437230");
        books[4] = new Book("Pride and Prejudice", "Jane Austen", "978-0141439518");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book you are looking for: ");
        String searchTitle = scanner.nextLine();
        scanner.close();
        boolean found = false;
        for (Book book : books) {
            if (book.title.equals(searchTitle)) {
                book.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}