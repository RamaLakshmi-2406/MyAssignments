package week1.day3;

public class Library {
	public String addBook(String bookTitle) {
        System.out.println("Book added successfully: " + bookTitle);
        return bookTitle;
    }

    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {

        Library library = new Library();
        String bookTitle = library.addBook("Introduction to Java");

        library.issueBook();

        System.out.println("Returned book title: " + bookTitle);
    }
}
