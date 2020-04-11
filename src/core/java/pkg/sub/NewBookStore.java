package core.java.pkg.sub;

import core.java.pkg.main.Book;

public class NewBookStore extends Book {

	public static void main(String[] args) {
		
		Book tamilBook = new Book("Tamil Book Version 2");
		tamilBook.setBookName("Tamil Book");
		System.out.println(tamilBook.getBookName());
		
//		System.out.println(tamilBook.bookName);
		
		System.out.println(tamilBook);

	}

}
