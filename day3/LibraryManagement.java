package week1.day3;

public class LibraryManagement {
	public static void main(String[] args) {
		Library library = new Library();

        String bookTitle = library.addBook("Effective Java");

        library.issueBook();

        System.out.println("Returned book title: " + bookTitle);
    }
	}


