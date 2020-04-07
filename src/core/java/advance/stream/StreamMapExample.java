package core.java.advance.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList = StudentDB.getStudentList();

		System.out.println("List of Student Names");
		System.out.println("-------------------------------");

		List<String> namesList = studentList.stream()
				.map(Student::getName)
				.sorted()
				.collect(Collectors.toList());
		namesList.forEach(System.out::println);

		System.out.println("-------------------------------");
		System.out.println("List of Activity");
		System.out.println("-------------------------------");

		List<String> activityList = studentList.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		activityList.forEach(System.out::println);

		System.out.println("-------------------------------");

		long totalActivities = studentList.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
		System.out.println("totalActivities: " + totalActivities);
	}
}