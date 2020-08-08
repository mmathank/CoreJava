package core.java.advance.functional.interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import core.java.advance.stream.Student;
import core.java.advance.stream.StudentDB;

public class PredicateExample {

	public static Predicate<Student> idGreaterThanOne=new Predicate<Student>(){@Override public boolean test(Student student){return student.getId()>1;}};

	public static Predicate<Student> idGreaterThanTwo = (student) -> student.getId() > 2;

	public static Predicate<Student> idGreaterThanOneAndTwo = idGreaterThanOne.and(idGreaterThanTwo);

	public static Predicate<String> nameStartsWith = (name) -> name.startsWith("M");

	public static Predicate<List<String>> activityContains = (activity) -> activity.contains("Cricket");

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();

		for (Student student : studentList) {
			if (idGreaterThanOne.test(student)) {
				System.out.println(student);
			}
		}

		for (Student student : studentList) {
			if (nameStartsWith.test(student.getName())) {
				System.out.println(student.getName());
			}
		}

		for (Student student : studentList) {
			if (idGreaterThanOneAndTwo.test(student)) {
				System.out.println(student);
			}
		}

		for (Student student : studentList) {
			if (activityContains.test(student.getActivities())) {
				System.out.println("Student: " + student.getName());
			}
		}

	}

}
