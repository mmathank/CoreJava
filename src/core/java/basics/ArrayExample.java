package core.java.basics;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arrOfNum = new int[3];
		arrOfNum[0] = 30;
		arrOfNum[1] = 10;
		arrOfNum[2] = 20;

		int[] arrOfNum2;
		arrOfNum2 = new int[] { 60, 50, 40 };

		int[] arrOfNum3 = { 70, 80, 90 };

		System.out.println("Array iteration using traditional for loop");
		for (int i = 0; i < arrOfNum.length; i++) {
			System.out.println(arrOfNum[i]);
		}

		System.out.println("Array iteration using enhanced for loop");
		for (int i : arrOfNum2)
			System.out.println(i);

		System.out.println("Using toString() method from Arrays class");
		System.out.println("arrOfNum3: " + Arrays.toString(arrOfNum3));

		int[][] twoDimArr = { { 1, 2, 3, 4, 5, 6 }, { 1, 1, 1, 1, 1, 1 }, { 0, 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 1, 1, 1, 1, 1 }, { 5, 4, 3, 2, 1, 0 } };

		for (int[] arr : twoDimArr) {
			System.out.println();
			for (int num : arr) {
				System.out.print(num + " ");
			}
		}

		System.out.println();
		


	}

}
