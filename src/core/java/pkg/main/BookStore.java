package core.java.pkg.main;

public class BookStore {

	public static void main(String[] args) {
		
		Book javaBook = new Book("Core Java",1000);
		
		javaBook.setPrice(1000);
		javaBook.setBookName("Core Java");
		
		System.out.println(javaBook.getBookName());
		System.out.println(javaBook.getPrice());
		
		System.out.println(javaBook);
	}

}
