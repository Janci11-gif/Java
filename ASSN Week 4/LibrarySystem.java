class LibraryItem {
    String title;
    String author;
    int id;
    
    LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }
    
    void getInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem {
    Book(String title, String author, int id) {
        super(title, author, id);
    }
    
    void getInfo() {
        System.out.println("Book - " + title + " by " + author);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;
    
    Magazine(String title, String author, int id, int issueNumber) {
        super(title, author, id);
        this.issueNumber = issueNumber;
    }
    
    void getInfo() {
        System.out.println("Magazine - " + title + ", Issue: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Java Programming", "John Doe", 101),
            new Magazine("Tech Today", "Editorial", 201, 45)
        };
        
        for(LibraryItem item : items) {
            item.getInfo();
        }
    }
}
