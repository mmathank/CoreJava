package core.java.basics;

public class StaticKeywordExample {
	
	static int counter;

	final int FIXED_PRICE = 10;
	
	public StaticKeywordExample() {
		counter++;
	}
	
	
	public static int getCounter() {
		return counter;
	}

	public static void main(String[] args) {

		new StaticKeywordExample();
		new StaticKeywordExample();
		new StaticKeywordExample();
		System.out.println("No of Instances created: " + getCounter());
		System.out.println("Changes not allowed: " + new StaticKeywordExample().FIXED_PRICE);
	}

}
