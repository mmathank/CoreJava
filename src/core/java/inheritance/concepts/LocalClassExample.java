package core.java.inheritance.concepts;

public class LocalClassExample {

	String country = "India";

	public void greet() {

		int rank = 01;
		
		class Cricket {
			
			String name = "Sachin Tendulkar";

			public String playerInfo() {
				System.out.println(rank);
				String msg = name + " : " + country;
				return msg;
			}
		}

		Cricket cricket = new Cricket();
		System.out.println(cricket.playerInfo());
	}

	public static void main(String[] args) {

		LocalClassExample lce = new LocalClassExample();
		lce.greet();

	}

}
