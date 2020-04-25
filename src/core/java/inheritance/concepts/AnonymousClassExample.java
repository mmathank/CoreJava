package core.java.inheritance.concepts;

public class AnonymousClassExample {

	interface Vehicle {
		public String showVehicleType();
	}
	
	public void driving() {
		
		class Car implements Vehicle {

			@Override
			public String showVehicleType() {
				return "It's a CAR";
			}
		}
		
//		Bike bike = new Bike();
		Vehicle bike = new Vehicle() {

			@Override
			public String showVehicleType() {
				return "It's a BIKE";
			}
			
		};
		
		Car car = new Car();
		System.out.println(car.showVehicleType());
		System.out.println(bike.showVehicleType());
	}
	
	
	public static void main(String[] args) {

		AnonymousClassExample ace = new AnonymousClassExample();
		ace.driving();
	}

}
