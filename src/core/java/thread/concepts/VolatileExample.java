package core.java.thread.concepts;

class Runner implements Runnable {
	
	boolean flag;
	
	public void run () {
		System.out.println("Inside Main Method");
		
		while (!flag) {
			try {
				Thread.sleep(500);
				System.out.println("Welcome");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void changeFlag(boolean flag) {
		this.flag = flag;
	}

}

public class VolatileExample {

	public static void main(String[] args) {

		Runner r1 = new Runner();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			Thread.sleep(1000);
			r1.changeFlag(true);
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Finished");
	}

}
