package core.java.collection.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSortExample {

	static Set<Integer> numSet = new HashSet<>();

	public static void populateSet() {

		while (numSet.size() <= 10) {
			numSet.add((int) (Math.random() * 100));
		}

		List<Integer> numList = new ArrayList<>(numSet);
		Collections.sort(numList);
		System.out.println(numList);
	}

	public static void main(String[] args) {
		populateSet();
	}
}
