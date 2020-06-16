package core.java.thread.concepts;

public class BlockVsMethod {

	int counterForA = 0;
	int counterForB = 0;

	Object lock1 = new Object();
	Object lock2 = new Object();

	public void methodA() {
		synchronized (lock1) {
			for (int i = 0; i < 10; i++) {
				counterForA++;
				System.out.println(counterForA);
			}
			System.out.println("counterForA: " + counterForA);
		}
	}

	public void methodB() {

		synchronized (lock2) {
			for (int i = 0; i < 10; i++) {
				counterForB++;
				System.out.println(counterForB);
			}
			System.out.println("counterForB: " + counterForB);
		}

	}

	public synchronized void methodC() {
		for (int i = 0; i < 10; i++) {
			counterForA++;
			System.out.println(counterForA);
		}
		System.out.println("counterForA: " + counterForA);
	}

	public synchronized void methodD() {

		for (int i = 0; i < 10; i++) {
			counterForB++;
			System.out.println(counterForB);
		}
		System.out.println("counterForB: " + counterForB);

	}

	public static void main(String[] args) {

		BlockVsMethod bvm = new BlockVsMethod();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				bvm.methodA();
//				bvm.methodC();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				bvm.methodB();
//				bvm.methodD();
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
	}

}
