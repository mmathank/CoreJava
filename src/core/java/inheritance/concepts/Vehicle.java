package core.java.inheritance.concepts;

public class Vehicle {

	static int price = 0;
	int speed = 0;
	static String name = "I'm a vehicle";

	public int showPrice() {
		return price;
	}

	public int showSpeed() {
		return speed;
	}
	
	//Method-Hiding
	public static String showName() {
		return name;
	}
}
