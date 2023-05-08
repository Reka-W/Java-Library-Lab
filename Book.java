package libraryLab;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book() {
    	
    }
    
    public Book(String bookTitle) {
    	title = bookTitle;
    }
    
    // Marks the book as rented
    public void borrowed() {
        borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 