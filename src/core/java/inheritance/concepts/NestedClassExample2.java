package core.java.inheritance.concepts;

public class NestedClassExample2 {

	private static int price = 100;

	String desc = "Complete Reference";

	public void display() {
		System.out.println("Non-Static Method from Outer class");
	}

//	Static Nested class 
	static class Book {

		private static String bookName = "C++";

		static String author = "Herbert Schildt";
		
		String desc = "Core Java";

		public int showPrice() {
			return price;
		}

		public static String showBookName() {
			return bookName;
		}
	}

	public static void main(String[] args) {

//		Creating object for static nested class
		Book b1 =  new NestedClassExample2.Book();

		System.out.println(b1.showPrice());
		System.out.println(Book.showBookName());
		System.out.println(Book.author);
		System.out.println(b1.desc);
		System.out.println(new NestedClassExample2().desc);
		
	}
}
