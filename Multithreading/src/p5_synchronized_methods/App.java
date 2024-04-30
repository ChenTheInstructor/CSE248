package p5_synchronized_methods;

public class App {
	private int count;

	public static void main(String[] args) {
		new App().doIncrement();
	}

	private synchronized void increment() {
		count++;
	}

	private void doIncrement() {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
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
		
		System.out.println("The final count is: " + count);
		
	}

}
