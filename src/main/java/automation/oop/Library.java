package automation.oop;

public class Library {
	public static void main(String[] args) {

		Author author1 = new Author("Florin", "ionel@yahoo.com");
		Book book1 = new Book("jungle book", 1900, 20, author1);

		String bookauthor = author1.getName();

		System.out.println("cartea este: " + book1.getName() + " " + book1.getYear() + " " + book1.getPrice() + " " + bookauthor);

	}
}
