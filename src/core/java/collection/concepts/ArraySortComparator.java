package core.java.collection.concepts;

import java.util.Arrays;

public class ArraySortComparator {

	static String[] fruits = { "orange", "Apple", "Banana", "banana", "Apple", "Orange" };

	public static void main(String[] args) {

		// using comparator
		Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(fruits));
		
/*		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));*/
	}
}
