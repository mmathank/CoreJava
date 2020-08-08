package core.java.exception.handling;

public class ExceptionHandling1 {

	public static void calculate() {
		int a = 0;
		int total = 10;
//		int c = total / a;
		
		String name = null;
		System.out.println(name.toLowerCase());
	}
	

	public static void main(String[] args) {

		try {
			calculate();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Exception Handled.. Program completed successfully!");
	}

}
