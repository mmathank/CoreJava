package core.java.advance.stream.terminal;

import static java.util.stream.Collectors.counting;

import java.util.List;

import core.java.advance.stream.Student;
import core.java.advance.stream.StudentDB;

public class CountingExample {

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		long count = studentList.stream()
					.map(Student::getActivities)
					.flatMap(List::stream)
					.distinct()
					.collect(counting());
		System.out.println("Total Number of Distinct Activities are: " + count);
	}

}
