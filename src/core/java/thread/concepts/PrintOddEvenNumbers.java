package core.java.thread.concepts;

/*class OddNumbers implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}*/

public class PrintOddEvenNumbers {

	public static void printOddNumbers() {
		System.out.println("Method Printing Odd numbers");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}

	public static void printEvenNumbers() {
		System.out.println("Method Printing Even numbers");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Thread Started");

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printOddNumbers();
		printEvenNumbers();
		System.out.println("Main Thread Completed..");
	}
}
