package p10_reentrantlock;

public class MainReentrantLock {

	public static void main(String[] args) {
		final Runner runner = new Runner();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				runner.thread1();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				runner.thread2();
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
		
		runner.finished();
	}

}
