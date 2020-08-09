package core.java.advance.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDB {

	static Student s1 = new Student(01, "Mathan", Arrays.asList("Swimming", "Basket Ball"), Arrays.asList(90, 90, 90));
	static Student s2 = new Student(02, "Dhanya", Arrays.asList("Cricket", "Basket Ball"), Arrays.asList(100, 100, 100));
	static Student s3 = new Student(03, "Ramya", Arrays.asList("Swimming", "Basket Ball"), Arrays.asList(80, 90, 95));

	public static List<Student> getStudentList() {

		List<Student> studentList = Arrays.asList(s1, s2, s3);
		return studentList;
	}
}
