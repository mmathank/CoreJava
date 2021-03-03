package core.java.basics;

public class Book {
	
	String bookName;
	int price;
	
	public void showDetails(String bookName) {
		String result = this.bookName.concat(" " + bookName);
		System.out.println(result);
	}
	
	public void showDetails(int price) {
		int result = price - 10;
		System.out.println(result);
	}
	
	public void showDetails(int price, String bookName) {
		
		this.bookName = bookName;
		this.price = price;
		System.out.println(this.bookName + " " + this.price);
	}
	public static void main(String[] args) {

		Book b1 = new Book();
		b1.bookName = "Test";
		b1.price = 100;
		
		b1.showDetails("written by Author X");
		b1.showDetails(110);
		
		b1.showDetails(500, "UpdatedBook");
	}
}
