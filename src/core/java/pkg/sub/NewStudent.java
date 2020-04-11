package core.java.pkg.sub;

import core.java.pkg.main.Department;

public class NewStudent extends Department {
	
	String departmentName = "Biology";
	
	public static void main(String[] args) {
		
		NewStudent newStud = new NewStudent();
		System.out.println(newStud.departmentName);
		newStud.showDepartment();
	}
}
