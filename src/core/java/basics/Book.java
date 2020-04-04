package core.java.basics;

public class Book {
	
	static byte price = (byte) 140;
	
/*	static {
		System.out.println("Inside Static Block");
	}
	
	static int a = Integer.parseInt("null");
	
	{
		System.out.println("Inside Instance Block");
	}*/
	
	String title;
	String author;
	
	public static void main(String args[]) {
		
		Book b1 = new Book();
		System.out.println("Main Method");
		System.out.println("price: " + price);
	}
}
