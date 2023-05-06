package libraryLab;

public class Library extends Book{

	private static final String OPEN_HOURS = "Libraries are open daily from 9am to 5pm.";
	private String address;
	
	public static String getOpenHours() {
		return OPEN_HOURS;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Library() {
		super("bookTitle");
	}
	
	public Library(String address) {
		super("bookTitle");
		this.address = address;
	}
	
	public void addBook() {

		
	}

	public static void printOpeningHours() {
		System.out.println(getOpenHours());
	}

	public void printAddress() {
		System.out.println(getAddress());;
	}
	
	public void borrowBook(String title) {
		if (title == null) {
			System.out.println("Sorry, this book is not in our catalog.");
		} else if (borrowed == false) {
			System.out.println("You successfully borrowed " + title + ".");
			borrowed = true;
		} else if (borrowed == true) {
			System.out.println("Sorry, this book is already borrowed.");
		}
	}
	
	public void printAvailableBooks() {

	}
	
	public void returnBook(String title) {
			System.out.println("You successfully returned " + title + ".");
			borrowed = false;
	}
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

//        // Add four books to the first library
//        firstLibrary.addBook(new Book("The Da Vinci Code"));
//        firstLibrary.addBook(new Book("Le Petit Prince"));
//        firstLibrary.addBook(new Book("A Tale of Two Cities"));
//        firstLibrary.addBook(new Book("The Lord of the Rings"));
//
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

//        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
//
//        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
//        System.out.println();
//        System.out.println("Books available in the second library:");
//        secondLibrary.printAvailableBooks();
        System.out.println();
//
//        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
//        firstLibrary.printAvailableBooks();
    }
}