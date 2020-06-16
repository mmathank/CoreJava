package core.java.thread.concepts;

class PrintNumber extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {

		try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {

		PrintNumber thread1 = new PrintNumber();
		thread1.start();

		PrintNumber thread2 = new PrintNumber();
		thread2.start();
	}

}
