package LibModel;
public class BookUI {
	public void getHeaderUI() {
		System.out.println("BookId  Title                Author");	
	}
	public void printBook(Book book) {
		String bookIDstringy = String.valueOf(book.getbookId());
		System.out.println(fixlength(bookIDstringy,6)+"  "+fixlength(book.gettitle(),20)+"  "+
	fixlength(book.getauthor(),20));
	}
	private String fixlength(String start, int length) {
		if (start.length() >= length) {
			return start.substring(0,length);
		}
			else {
				while(start.length()<length)
				{
				start += " ";	
				}
				return start;
			}
		}
public void printBookCatalogue(Book[] BookCatalogue) {
	for(int Counter=0;Counter<(BookCatalogue.length);Counter++) {
		if (BookCatalogue[Counter]!= null)
		printBook(BookCatalogue[Counter]);
	}
}
}
