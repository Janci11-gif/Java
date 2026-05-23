class Book {
    String title;
    String author;
     //constructor-method toinitialize objects//
    Book(String t, String a) {
        title = t;
        author = a;
    } 
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
public class Recordbook {
    public static void main(String[] args) {

        //objects//
        Book b1 = new Book("English", "Franz Kafkas");
        Book b2= new Book("48 laws of power", "Robert Greene");
         //displaying values//
        b1.display();//passing value//
        b2.display();
    }
}
