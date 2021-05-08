pzackage LibModel;

public class BookCatalogue {
	private Book[] bookarray = new Book[100];

	private int nextPosition = 0;

	public Book[] getbookarray() {
		return bookarray;
	}

	public void addBookarray(Book newBook) {
		bookarray[nextPosition] = newBook;
		nextPosition++;
	}

	public Book findBook(String title) {
		for (int counter = 0; counter < nextPosition; counter++) {
			if (bookarray[counter].gettitle().equalsIgnoreCase(title)) {
				return bookarray[counter];
			}
		}
		return null;
	}
}
