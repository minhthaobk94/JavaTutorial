package oop.classes;

public class TestBook {

	public static void main(String[] args) {
		Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		Book book = new Book("Dummy Book", author, 19.95, 99);
		System.out.println(book);

		book.setPrice(29.95);
		book.setQty(28);
		System.out.println("name is: " + book.getName());
		System.out.println("price is: " + book.getPrice());
		System.out.println("qty is: " + book.getQty());
		System.out.println("Author is: " + book.getAuthor());
		System.out.println("Author's name is: " + book.getAuthor().getName());
		System.out.println("Author's email is: " + book.getAuthor().getEmail());

		Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);
	}

}
