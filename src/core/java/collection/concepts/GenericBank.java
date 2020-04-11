package core.java.collection.concepts;

public class GenericBank<T> {
	
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		
		GenericBank<Icici> salaryAccount = new GenericBank<>();
		salaryAccount.setT(new Icici());
		System.out.println(salaryAccount.getT());
		
		GenericBank<Hdfc> personalAccount = new GenericBank<>();
		personalAccount.setT(new Hdfc());
		System.out.println(personalAccount.getT());
		
//		Stronger Type Checks at compile time
//		Hdfc hdfc = (Hdfc) salaryAccount.getT();
	}
}