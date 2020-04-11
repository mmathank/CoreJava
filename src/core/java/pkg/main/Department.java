package core.java.pkg.main;

public class Department {
	
	//Can be accessed from NewStudent which is on different package
	protected String departmentName = "Computer Science";
	
	protected void showDepartment() {
		System.out.println("Department Name is: " + departmentName);
	}
	
	public static void displayDept() {
		System.out.println("Static Method from Department");
	}

}
