package core.java.inheritance.concepts;

public class Car extends Vehicle {

	int price = 100;
	int speed = 50;
	static String name = "I'm a Car";

	@Override
	public int showPrice() {
		return price;
	}

	@Override
	public int showSpeed() {
		return speed;
	}
	
	//Method-Hiding
	public static String showName() {
		return name;
	}
	
	public String welcomeMsg() {
		return "Welcome";
	}
	
	public String welcomeMsg(String name) {
		return "Welcome " + name;
	}

	public String welcomeMsg(String name, String city) {
		return "Welcome " + name + " " + city;
	}
	
	public static void main(String[] args) {

		//Method Overriding
		Vehicle car = new Car();
		System.out.println("Price: " + car.showPrice());
		System.out.println("Speed: " + car.showSpeed());
		
		//Method Hiding
		Vehicle car2 = new Car();
		System.out.println("Name: " + car2.showName());
		
		//Car2 can be type of Vehicle so explicit down-casting works!
		Car car4 = (Car) car2;
		
		System.out.println("Variable Hiding");
		Vehicle car3 = new Car();
		System.out.println(car3.price);
		System.out.println(car3.speed);
		System.out.println(car3.name);
		
/*		Vehicle vehicle = new Vehicle();
//		Vehicle cannot be type of Car explicit down-casting will throw ClassCastException
		Car myCar = (Car) vehicle;*/
		
//		Method Overloading
		Car car5 = new Car();
		System.out.println("\nMethod Overloading");
		System.out.println(car5.welcomeMsg());
		System.out.println(car5.welcomeMsg("Mathan"));
		System.out.println(car5.welcomeMsg("Mathan", "Madurai"));
	}

}
