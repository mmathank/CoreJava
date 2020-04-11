package core.java.pkg.main;

public abstract class Employee {
	
//	Abstract-method
	public abstract void showEmployerType();
	
//	non-abstract method
	public void welcome() {
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is an Abstract Class");
	}
}