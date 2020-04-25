package core.java.inheritance.concepts;

public class NestedClassExample1 {

	private String bookName = "Java";
	private int price = 100;

	static String desc = "Complete Reference";

	public void display() {
		System.out.println("Static Method from Outer class");
	}

//	Non-Static Nested class or Inner class
	class Book {

		private String bookName = "C++";

//		static field & method are not allowed in non-static class
		static final String author = "Herbert Schildt";

		public int showPrice() {
			return price;
		}

		public String showBookName() {
			return bookName;
		}
	}

	public static void main(String[] args) {

		NestedClassExample1 nce = new NestedClassExample1();
		
//		Creating object for inner class
		Book b1 = nce.new Book();

//		Book b2 = new NestedClassExample1().new Book();

		System.out.println(b1.showPrice());
		System.out.println(b1.showBookName());
		System.out.println(nce.bookName);

//		accessing static constant
		System.out.println(Book.author);

		System.out.println(desc);
	}
}
