package core.java.thread.concepts;

class PrintNumbers implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {

		PrintNumbers pn = new PrintNumbers();
		Thread thread1 = new Thread(pn);
		thread1.start();

		new Thread(new PrintNumbers()).start();

		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 100; i < 110; i++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(i);
				}
			}

		});
		thread3.start();
	}
}
