package core.java.pkg.main;

public class Book {
	
/*	super();
	this();*/
	
	public Book() {
		System.out.println("Default Constructor");
	}
	
	public Book (String y) {
		bookName = y;
		System.out.println("Parameterized Constructor with Name");
		
	}
	
	public Book (String x, int price) {
//		bookName = x;
		this(x);
		this.price = price;
		System.out.println("Parameterized Constructor with Name & Price");
	}
	
	
	private int price;
	String bookName;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Book [price=" + price + ", bookName=" + bookName + "]";
	}

}
