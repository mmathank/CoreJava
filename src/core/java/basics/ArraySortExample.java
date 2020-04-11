package core.java.basics;

import java.util.Arrays;

public class ArraySortExample {

	static int[] numbers = { 25, 12, 14, 10, 50, 10 };
	
	static int[] randomNumber;
	
	static void sortArray(int size) {
		
		randomNumber = new int[size];
		
		for(int i = 0; i < size; i++) {
			randomNumber[i] = (int) (Math.random() * 10);
		}
		
	}

	public static void main(String[] args) {
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		sortArray(5);
		Arrays.sort(randomNumber);		
		System.out.println(Arrays.toString(randomNumber));
		
		System.out.println("Random Value: " + Math.random());
	}
}
