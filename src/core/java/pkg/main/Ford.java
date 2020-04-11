package core.java.pkg.main;

public class Ford extends Employee {

	public static void main(String[] args) {
		
		Ford ford = new Ford();
		ford.showEmployerType();
		ford.welcome();
	}

	@Override
	public void showEmployerType() {
		System.out.println("Ford Employee");
	}

}
