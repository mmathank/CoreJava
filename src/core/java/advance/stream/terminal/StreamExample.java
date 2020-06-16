package core.java.advance.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.counting;

public class StreamExample {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple","Banana","Grapes","Orange");
		
		System.out.println(fruits.stream().collect(Collectors.joining()));
		System.out.println(fruits.stream().collect(Collectors.joining("-")));
		System.out.println(fruits.stream().collect(joining("-","(",")")));
		
		long count = fruits.stream().collect(counting());
		System.out.println(count);
	}

}
