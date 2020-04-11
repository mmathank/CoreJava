package core.java.pkg.main;

public class Cts extends Employee {

	public static void main(String[] args) {
		
		Cts cts = new Cts();
		cts.showEmployerType();
		cts.welcome();
	}

	@Override
	public void showEmployerType() {
		System.out.println("CTS Employee");
		
	}

}
