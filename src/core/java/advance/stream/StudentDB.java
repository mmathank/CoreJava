package core.java.advance.stream;

import java.util.Arrays;
import java.util.List;

public class StudentDB {

	public static List<Student> getStudentList() {

		Student s1 = new Student(01, "Mathan", Arrays.asList("Swimming", "Basket Ball"),Arrays.asList(90,90,90));
		Student s2 = new Student(02, "Dhanya", Arrays.asList("Cricket", "Basket Ball"),Arrays.asList(100,100,100));
		Student s3 = new Student(03, "Ramya", Arrays.asList("Swimming", "Basket Ball"),Arrays.asList(80,90,95));

		List<Student> studentList = Arrays.asList(s1, s2, s3);
		return studentList;
	}
}
