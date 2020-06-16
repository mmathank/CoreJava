package core.java.advance.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

public class StreamExample {

	public static void main(String[] args) {


		Predicate<Student> byId = (student -> student.getId() > 01);
		Predicate<Student> bySports = (student -> student.getActivities().contains("Cricket"));
		Predicate<Student> byIdAndSports = byId.and(bySports);

		Map<String, List<String>> studentMap = StudentDB.getStudentList().stream()
				.filter(byIdAndSports)
				.collect(toMap(Student::getName, Student::getActivities));

		studentMap.forEach((name, activity) -> System.out.println("Name: " + name + ", Activity: " + activity));

		//Debugging Stream API
		System.out.println("Debug: Stream API");
		Map<String, List<String>> studentMap2 = StudentDB.getStudentList().stream()
				.peek(student -> System.out.println("All Students: " + student))
				.filter(byId)
				.peek(student -> System.out.println("After 1st Filter: " + student))
				.filter(byIdAndSports)
				.peek(student -> System.out.println("After 2nd Filter: " + student))
				.collect(toMap(Student::getName, Student::getActivities));
		
		studentMap2.forEach((name, activity) -> System.out.println("Name: " + name + ", Activity: " + activity));
	}
}
