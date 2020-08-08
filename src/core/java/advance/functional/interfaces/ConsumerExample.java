package core.java.advance.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import core.java.advance.stream.Student;
import core.java.advance.stream.StudentDB;

public class ConsumerExample {

	static Consumer<Student> studentName = new Consumer<Student>() {
		@Override
		public void accept(Student student) {
			System.out.print(student.getName() + " ");
		}
	};

	static Consumer<Student> studentActivity = (activity) -> System.out.println(activity.getActivities() + " ");

	static Consumer<Student> nameAndActivity = studentName.andThen(studentActivity);
	
	static Consumer<Integer> studentId = (id) -> System.out.println(id);

	static Consumer<Integer> power = (n) -> System.out.println(n * n);

	static Consumer<Integer> addTenToN = new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			System.out.println(t + 10);
		}

	};

	public static void main(String[] args) {

		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach(studentName);
		System.out.println();
		studentList.forEach(studentActivity);
		studentList.forEach(nameAndActivity);
		
		studentList.forEach((studentObject -> studentId.accept(studentObject.getId())));

		System.out.println("----------------------------------------");

		for (Student temp : studentList) {
			System.out.println(temp.getName());
		}

		for (Student temp : studentList) {
			System.out.println(temp.getActivities());
		}

		for (Student temp : studentList) {
			System.out.println(temp.getName() + " " + temp.getActivities());
		}

		System.out.println("----------------------------------------");
		List<Integer> numbers = Arrays.asList(10, 20, 30);
		numbers.forEach(power);

		System.out.println("----------------------------------------");
		for (Integer n : numbers) {
			System.out.println(n * n);
		}

		System.out.println("----------------------------------------");
		numbers.forEach(addTenToN);
		
		System.out.println("----------------------------------------");
		numbers.forEach(power);
		
		System.out.println("----------------------------------------");
		numbers.forEach(power);
		
		System.out.println("----------------------------------------");
		numbers.forEach(power);
		
		
	}
}
