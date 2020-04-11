package core.java.collection.concepts;

import java.util.HashMap;
import java.util.Map;

public class Student {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<>();
	}
}
