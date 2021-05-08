package LibModel;

public class Book {
	
	private int bookId;
	private String title;
	private String author;
	private String isbn;
	
	public Book(int bookId,String title,String author,String isbn) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public int getbookId() {
		return bookId;
		
	}
     public String gettitle() {
    	 return title;
	}
     public String getauthor() {
		return author;
	}
     public String getisbn() {
		return isbn;
	}
}
