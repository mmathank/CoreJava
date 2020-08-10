package core.java.advance.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import core.java.advance.domain.Student;
import core.java.advance.domain.StudentDB;

public class StreamMatchExample2 {
	
	static Predicate<List<String>> checkDuplicateActivity = (activities) -> {
		Set<String> uniqueActivity = new HashSet<>();
		return activities.stream().allMatch(uniqueActivity::add);
	};

	public static void main(String[] args) {
		
		List<Student> studentList = StudentDB.getStudentList();
		studentList.forEach((student -> {
			if(!checkDuplicateActivity.test(student.getActivities())) {
				System.out.println(student.getActivities());
			}
		}));
	}

}
