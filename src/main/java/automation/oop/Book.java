package automation.oop;

public class Book {

	private String name;
	private int year;
	private int price;
	private Author author;

	public Book(String name, int year, int price, Author author) {

		this.name = name;
		this.year = year;
		this.price = price;
		this.author = author;

	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	public Author getAuthor() {
		return author;
	}

}
