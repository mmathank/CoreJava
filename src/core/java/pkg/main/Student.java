package core.java.pkg.main;

public class Student extends Department implements Playable, Storeable {
	
	String name = "Mathan";
	String departmentName = "Maths";
	
	public void display() {
		System.out.println("Student Name is: " + name);
	}
	
	protected void showDepartment() {
		System.out.println("Department Name is: " + departmentName);
	}
	
	public static void displayDept() {
		System.out.println("Static Method from Student");
	}
	
	public void playMusic() {
		System.out.println("Playing Music");
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.departmentName);
		s1.showDepartment();
		Department.displayDept();
		displayDept();
		s1.playMusic();
		s1.storeThings();
	}

	@Override
	public void storeThings() {
		System.out.println("Storing Things");
		
	}

}
