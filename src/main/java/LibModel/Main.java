package LibModel;

public class Main {

	public static void main(String[] args) {
		BookCatalogue bookcatalog = new BookCatalogue();
		Book book = new Book(1, "FundamentalsOfPhysics", "Hawkins", "123456");
		Book book1 = new Book(2, "ConceptsOFPhysics", "HCVerma", "234561");

		bookcatalog.addBookarray(book);
		bookcatalog.addBookarray(book1);

		BookUI ui = new BookUI();
		ui.getHeaderUI();

		// ui.printBook(book);
		// ui.printBook(book1);
		// System.out.println(book.gettitle());

		ui.printBookCatalogue(bookcatalog.getbookarray());

		Book foundBook = bookcatalog.findBook("ConceptsOFPhysics");
		if (foundBook != null) {
			System.out.println("We found book" + foundBook.gettitle());
		}

	}
}